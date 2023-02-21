package interactor

import io.mockk.every
import io.mockk.mockk
import model.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GetCitiesNamesSortedByCheapestBananaPriceInteractorTest {

    lateinit var dataSource: CostOfLivingDataSource
    private lateinit var getCitiesNamesSortedByCheapestBananaPriceInteractor: GetCitiesNamesSortedByCheapestBananaPriceInteractor

    @BeforeEach
    fun setUp() {
        dataSource = mockk()
        getCitiesNamesSortedByCheapestBananaPriceInteractor = GetCitiesNamesSortedByCheapestBananaPriceInteractor(dataSource)
    }

    @Test
    fun should_ignore_entries_with_null_banana_price() {
        // given
        every { dataSource.getAllCitiesData() } returns listOf(
            cityEntity("A", null),
            cityEntity("B", 10.25f)
        )

        val actual = getCitiesNamesSortedByCheapestBananaPriceInteractor.execute("A", "B")
        val expected = listOf("B")

        assertEquals(expected, actual)
    }

    @Test
    fun should_allow_only_correct_cities_names() {
        // given
        every { dataSource.getAllCitiesData() } returns listOf(
            cityEntity("A", 5.1f),
            cityEntity("B", 10.25f)
        )

        val actual = getCitiesNamesSortedByCheapestBananaPriceInteractor.execute("A")
        val expected = listOf("A")

        assertEquals(expected, actual)
    }

    @Test
    fun given_cities_with_correct_names_and_non_null_banana_prices_should_sort_all() {
        // given
        every { dataSource.getAllCitiesData() } returns listOf(
            cityEntity("A", 5.1f),
            cityEntity("B", 10.25f),
            cityEntity("C", 2.25f),
        )

        val actual = getCitiesNamesSortedByCheapestBananaPriceInteractor.execute("A", "B", "C")
        val expected = listOf("C", "A", "B")

        assertEquals(expected, actual)
    }





    private fun citiesEntities(): List<CityEntity> {
        return listOf(
            cityEntity("A", 20.0f),
            cityEntity("B", 10.25f)
        )
    }
    private fun cityEntity(cityName: String, bananaPrice: Float?): CityEntity {
        return CityEntity(
            cityName,
            "",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, bananaPrice, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            null,
            true

        )
    }


}