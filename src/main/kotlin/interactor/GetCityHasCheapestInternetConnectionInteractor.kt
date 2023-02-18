package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity?{
        return dataSource
            .getAllCitiesData()
            .filter (::excludeNullSalariesAndLowQualityDataAndNullInternetConnection)
            .sortedBy (::sortByAverageBetweenNetSalaryAndInternetPrice)
            .run {
                if (isEmpty())
                    throw Exception("There is no enough data")
                else
                    first()
            }
    }

    private fun excludeNullSalariesAndLowQualityDataAndNullInternetConnection(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null &&
                city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!=null
    }
    private fun sortByAverageBetweenNetSalaryAndInternetPrice(city: CityEntity):Float{
        return city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! / city.averageMonthlyNetSalaryAfterTax!!
    }

}