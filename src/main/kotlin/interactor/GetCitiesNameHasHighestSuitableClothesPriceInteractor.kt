package interactor

import model.CityEntity

class GetCitiesNameHasHighestSuitableClothesPriceInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        return dataSource.getAllCitiesData()
            .filter(::excludeAnyNullClothPriceAndLowQualityData)
            .sortedBy(::getSumOfClothesPricesOfCity)
            .takeIf { limit >= 0 }
            ?.take(limit)
            ?.map { it.cityName } ?: emptyList()
    }

    private fun excludeAnyNullClothPriceAndLowQualityData(city:CityEntity): Boolean{
        return  city.dataQuality &&
                city.clothesPrices.onePairOfJeansLevis50oneOrSimilar != null &&
                city.clothesPrices.onePairOfMenLeatherBusinessShoes != null &&
                city.clothesPrices.onePairOfNikeRunningShoesMidRange != null &&
                city.clothesPrices.oneSummerDressInAChainStoreZaraHAndM != null
    }

    private fun getSumOfClothesPricesOfCity(city:CityEntity): Float{
        return  city.clothesPrices.onePairOfJeansLevis50oneOrSimilar!! +
                city.clothesPrices.onePairOfMenLeatherBusinessShoes!! +
                city.clothesPrices.onePairOfNikeRunningShoesMidRange!! +
                city.clothesPrices.oneSummerDressInAChainStoreZaraHAndM!!
    }
}