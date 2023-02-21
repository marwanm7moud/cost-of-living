package interactor

import model.CityEntity

class GetTheMostSuitableCityForSaving(private val dataSource: CostOfLivingDataSource) {
    companion object {
        private const val AVERAGE_SALARY = 2
        private const val BREAD_CONSUMPTION_PER_KG = 30
        private const val CHEESE_CONSUMPTION_PER_KG = 1
        private const val BEEF_CONSUMPTION_PER_KG = 4
        private const val CHICKEN_CONSUMPTION_PER_KG = 10
        private const val RICE_CONSUMPTION_PER_KG = 2
        private const val OTHER_NEEDS_CONSUMPTION = 250
    }
    fun execute():CityEntity{
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndApartmentAndFoodThings)
            .sortedByDescending(::savesAfterPayAllThings)
            .first()
    }
    private fun excludeNullSalariesAndApartmentAndFoodThings(cityEntity: CityEntity):Boolean{
        return cityEntity.run{
                averageMonthlyNetSalaryAfterTax!=null
               // && cityEntity.realEstatesPrices.apartment3BedroomsOutsideOfCentre!=null          مش محتجاها عشان هو بيروح بالعجله مش هيقدر يوصلها
                && foodPrices.loafOfFreshWhiteBread500g!=null
                && foodPrices.localCheese1kg!=null
                && foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!=null
                && foodPrices.chickenFillets1kg!=null
                && foodPrices.riceWhite1kg!=null
    }}
    private fun savesAfterPayAllThings(cityEntity: CityEntity):Float{
        val foodPrices = cityEntity.foodPrices
        return (cityEntity.averageMonthlyNetSalaryAfterTax!!*AVERAGE_SALARY)-
                (foodPrices.loafOfFreshWhiteBread500g!!*BREAD_CONSUMPTION_PER_KG)-
                (foodPrices.localCheese1kg!!*CHEESE_CONSUMPTION_PER_KG)-
                (foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!*BEEF_CONSUMPTION_PER_KG)-
                (foodPrices.chickenFillets1kg!!*CHICKEN_CONSUMPTION_PER_KG)-
                (foodPrices.riceWhite1kg!!*RICE_CONSUMPTION_PER_KG)-
                OTHER_NEEDS_CONSUMPTION
    }
}
