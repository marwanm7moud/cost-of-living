package interactor

import org.junit.jupiter.api.Test
import dataSource.FakeCsvDataSourceForGetCitiesNamesRepeatedMoreThanTwoTimes
import dataSource.GetCitiesNamesRepeatedMoreThanTwoTimes2
import dataSource.GetCitiesNamesRepeatedMoreThanTwoTimes3
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNamesRepeatedMoreThanTwoTimesTest {

    private lateinit var fakeData: FakeCsvDataSourceForGetCitiesNamesRepeatedMoreThanTwoTimes
    private lateinit var fakeData2: GetCitiesNamesRepeatedMoreThanTwoTimes2
    private lateinit var fakeData3: GetCitiesNamesRepeatedMoreThanTwoTimes3
    @BeforeAll
    fun setup() {
        fakeData = FakeCsvDataSourceForGetCitiesNamesRepeatedMoreThanTwoTimes()
        fakeData2 = GetCitiesNamesRepeatedMoreThanTwoTimes2()
        fakeData3 = GetCitiesNamesRepeatedMoreThanTwoTimes3()
    }

    @Test
    fun should_ReturnCorrectRepeatedCities_When_PassCorrectData() {
        //given repeated cities names
        val expected= listOf("Cairo")
        //when
        val result=GetCitiesNamesRepeatedMoreThanTwoTimes(fakeData).execute(5)
        //then
        assertEquals(expected,result)
    }

    @Test
    fun should_ReturnEmptyList_When_PassEachCityOneTime() {
        //given list with only one time repeated cities
        val expected= emptyList<String>()
        //when
        val result=GetCitiesNamesRepeatedMoreThanTwoTimes(fakeData2).execute()
        //then
        assertEquals(expected,result)
    }
    @Test
    fun should_ReturnEmptyList_When_PassEmptyList() {
        //given empty list
        val expected= emptyList<String>()
        //when
        val result=GetCitiesNamesRepeatedMoreThanTwoTimes(fakeData3).execute()
        //then
        assertEquals(expected,result)
    }
}