package interactor

import model.CityEntity

class GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyIt(private val dataSource: CostOfLivingDataSource) {
    fun execute(limit: Int = 10): List<Pair<String, Float>> {
        return dataSource.getAllCitiesData()
            .filter(::excludeLowDataQualityAndCitiesWithNoMeterPrice)
            .sortedBy(::numberOfYearNeededToBuyApartment)
            .take(limit)
            .map { (Pair(it.cityName, numberOfYearNeededToBuyApartment(it))) }
    }

    private fun excludeLowDataQualityAndCitiesWithNoMeterPrice(city: CityEntity): Boolean {
        return city.dataQuality &&
                city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null
                && city.averageMonthlyNetSalaryAfterTax != null
    }

    private fun numberOfYearNeededToBuyApartment(city: CityEntity): Float {
        return (city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! * apartmentWithHundredSquareMeter) / (city.averageMonthlyNetSalaryAfterTax!! * salaryInWholeYear)
    }

    companion object {
        private const val apartmentWithHundredSquareMeter = 100
        private const val salaryInWholeYear = 12
    }
}