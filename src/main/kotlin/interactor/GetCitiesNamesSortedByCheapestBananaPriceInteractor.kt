package interactor

import model.CityEntity

class GetCitiesNamesSortedByCheapestBananaPriceInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(vararg cities: String): List<String> {
        return dataSource.getAllCitiesData()
            .asSequence()
            .filter { city -> isCityNameInTheList(city.cityName, cities.asList()) }
            .filter(::isBananaPriceNonNull)
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map{ it.cityName }
            .toList()
    }

    private fun isBananaPriceNonNull(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }

    private fun isCityNameInTheList(name: String, list: List<String>): Boolean {
        return list.contains(name)
    }

}