//package interactor
//
//import dataSource.FakeCsvDataSource
//import dataSource.utils.CsvParser
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.Assertions.*
//import org.junit.jupiter.api.BeforeAll
//import org.junit.jupiter.api.TestInstance
//
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//internal class GetTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractorTest {
//  lateinit var csvParser : CsvParser
//  lateinit var dataSource: CostOfLivingDataSource
//  lateinit var getTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor:GetTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor
//  @BeforeAll
//  fun setup()
//  {
//    csvParser= CsvParser()
//    dataSource  = FakeCsvDataSource(csvParser)
//    getTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor=GetTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor(dataSource)
//  }
//
//  @Test
//  fun should_ReturnValueNotNull_when_Execute() {
//    // given
//
//    // when
//    val result = getTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor.execute()
//    // then
//
//    assertNotNull(result)
//  }
//  @Test
//  fun should_ReturnListOfTenCites_when_Execute() {
//    // given
//    val ListOfCites= listOf("Narayanganj", "Latakia", "Aleppo", "Sri Jayewardenepura Kotte", "Jaramana", "Banjul", "Homs", "Damascus", "Kasese", "Hamah")
//    // when
//    val result = getTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor.execute()
//    // then
//    assertEquals(ListOfCites, result)
//  }
//
//
//  @Test
//  fun should_ReturnFirstItemInList_when_Execute()
//  {
//    // given
//
//    // when
//    val result = getTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor.execute()[0]
//    // then
//    assertEquals("Narayanganj", result)
//
//  }
//
//  @Test
//  fun should_ReturnLastItemInList_when_Execute()
//  {
//    // given
//
//    // when
//    val result = getTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor.execute()[9]
//    // then
//    assertEquals("Hamah", result)
//
//  }
//
//
//
//
//
//}