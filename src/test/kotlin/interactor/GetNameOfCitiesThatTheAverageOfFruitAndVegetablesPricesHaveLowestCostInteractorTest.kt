package interactor

import dataSource.FakeCsvDataSourceForAverageOfFruitAndVegetables
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetNameOfCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractorTest {
  lateinit var dataSource: CostOfLivingDataSource
  lateinit var getNameOfCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor:GetNameOfCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor
  @BeforeAll
  fun setup()
  {
    dataSource  = FakeCsvDataSourceForAverageOfFruitAndVegetables()
    getNameOfCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor=GetNameOfCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor(dataSource)
  }

  @Test
  fun should_ReturnValueNotNull_when_Execute() {
    // given
    val limit =10

    // when
    val result = getNameOfCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor.execute(limit)
    // then

    assertNotNull(result)
  }
  @Test
  fun should_ReturnListOfTenCites_when_Execute() {
    // given

    val ListOfCites= listOf("Alexandria", "paris", "Mexico", "Hyderabad", "Kampala", "Dushanbe", "Lahore", "Washington", "Ottawa", "Karachi")
    // when

    val result = getNameOfCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor.execute()
    // then
    assertEquals(ListOfCites, result)
  }




  @Test
  fun should_ReturnListOfFourCites_when_ExecuteWithLimit()
  {
    // given
    val ListOfCites= listOf("Alexandria", "paris", "Mexico", "Hyderabad")
    val limit =4
    // when
    val result = getNameOfCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor.execute(limit)
    // then
    assertEquals(ListOfCites,result)

  }


  @Test
  fun should_ReturnEmptyList_When_TheLimitEqualZero(){
    //given
    val limit=0
    // when
    val result = getNameOfCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor.execute(limit)
    // then
    assertEquals(emptyList<String>(),result)
  }
  @Test
  fun should_ReturnSizeOfTenCities_When_Execute() {
    //given
    //When
    val result = getNameOfCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor.execute()
    //Then
    assertTrue(result.size == 10)
  }
}