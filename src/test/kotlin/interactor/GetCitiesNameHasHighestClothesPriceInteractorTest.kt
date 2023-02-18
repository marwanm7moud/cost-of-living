package interactor

import dataSource.FakeClothesDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNameHasHighestClothesPriceInteractorTest {

    lateinit var dataSource: CostOfLivingDataSource
    lateinit var citiesName: GetCitiesNameHasHighestSuitableClothesPriceInteractor

    @BeforeAll
    fun setup(){
        dataSource  = FakeClothesDataSource()
        citiesName = GetCitiesNameHasHighestSuitableClothesPriceInteractor(dataSource)
    }

    @Test
    fun should_returnListOfSizeSeven_whenExecuteWithLimitFifty(){
        // given
        val limit = 50
        val expected = 7
        // when
        val result = citiesName.execute(limit).size
        // then
        assertEquals(expected, result)
    }

    @Test
    fun should_returnCorrectList_whenExecuteWithLimitFifty(){
        // given
        val limit = 50
        val expected = listOf("Havana", "Moratuwa", "Las Tunas", "Homs", "Uyo", "Warri", "Damascus")
        // when
        val result = citiesName.execute(limit)
        // then
        assertEquals(expected, result)
    }
    @Test
    fun should_returnListOfSizeFive_whenExecuteWithLimitFive(){
        // given
        val limit = 5
        val expected = 5
        // when
        val result = citiesName.execute(limit).size
        // then
        assertEquals(expected, result)
    }

    @Test
    fun should_returnCorrectList_whenExecuteWithLimit10(){
        // given
        val limit = 5
        val expected = listOf("Havana", "Moratuwa", "Las Tunas", "Homs", "Uyo")
        // when
        val result = citiesName.execute(limit)
        // then
        assertEquals(expected, result)
    }

}