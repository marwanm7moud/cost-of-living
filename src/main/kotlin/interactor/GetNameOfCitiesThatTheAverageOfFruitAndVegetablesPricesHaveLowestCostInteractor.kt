package interactor

import model.CityEntity

class GetNameOfCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor (
  private val dataSource: CostOfLivingDataSource,) {

  fun execute(limit: Int=10): List<String> {
    return dataSource
      .getAllCitiesData()
      .filter(::excludeNullSalariesAndFruitAndVegetablesPrices)
      .sortedBy(::sortTheAverageOfFruitAndVegetablesPricesHaveLowestCost)
      .take(limit)
      .map { it.cityName }

  }

  private fun excludeNullSalariesAndFruitAndVegetablesPrices(city: CityEntity): Boolean {
    return city.averageMonthlyNetSalaryAfterTax != null &&
            city.dataQuality&&
            city.fruitAndVegetablesPrices.apples1kg != null &&
            city.fruitAndVegetablesPrices.banana1kg!= null&&
            city.fruitAndVegetablesPrices.lettuceOneHead!= null &&
            city.fruitAndVegetablesPrices.onion1kg != null &&
            city.fruitAndVegetablesPrices.oranges1kg != null&&
            city.fruitAndVegetablesPrices.potato1kg != null &&
            city.fruitAndVegetablesPrices.tomato1kg!= null

  }
  private fun sortTheAverageOfFruitAndVegetablesPricesHaveLowestCost(city: CityEntity):Double{
    return city.fruitAndVegetablesPrices.run {
      listOf(apples1kg!! ,
      banana1kg!! ,
      lettuceOneHead!! ,
      onion1kg!! ,
      oranges1kg!! ,
      potato1kg!! ,
      tomato1kg!!).average()
    }



  }


}