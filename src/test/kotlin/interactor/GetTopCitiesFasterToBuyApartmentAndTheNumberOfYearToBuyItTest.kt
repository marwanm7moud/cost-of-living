package interactor


import dataSource.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyItTest {

    private lateinit var dataLowQuality: FakeCsvDataSourceToGetTheMinimumNumberOfYearsToBuyApartment
    private lateinit var dataNoSalary: FakeCsvDataSourceToGetDataWithNoSalary
    private lateinit var dataNoMeterPrice: FakeCsvDataSourceToGetDataWithHighNoMeterPrice
    private lateinit var dataAllInformation: FakeCsvDataSourceToGetNeededData
    private lateinit var dataEqualEmptyList: FakeCsvDataSourceWithNoData


    @BeforeAll
    fun setup() {
        dataLowQuality = FakeCsvDataSourceToGetTheMinimumNumberOfYearsToBuyApartment()
        dataNoSalary = FakeCsvDataSourceToGetDataWithNoSalary()
        dataNoMeterPrice = FakeCsvDataSourceToGetDataWithHighNoMeterPrice()
        dataAllInformation = FakeCsvDataSourceToGetNeededData()
        dataEqualEmptyList = FakeCsvDataSourceWithNoData()

    }
    @Test
    fun should_returnEmptyList_whenNoData() {
        //given data is empty list
        val expected = emptyList<Pair<String, Float>>()
        //when counting number of years needed to buy the apartment
        val result = GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyIt(dataEqualEmptyList).execute()
        //then return empty list
        assertEquals(expected, result)
    }

    @Test
    fun should_returnEmptyList_whenTheDataHasNoMeterPrice() {
        //given city with no meter price
        val expected = emptyList<Pair<String, Float>>()
        //when counting number of years needed to buy the apartment
        val result = GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyIt(dataNoMeterPrice).execute()
        //then return empty list
        assertEquals(expected, result)
    }

    @Test
    fun should_returnEmptyList_whenTheDataWithNoSalary() {
        //given city with no average monthly salary
        val expected = emptyList<Pair<String, Float>>()
        //when counting number of years needed to buy the apartment
        val result = GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyIt(dataNoSalary).execute()
        //then return empty list
        assertEquals(expected, result)
    }

    @Test
    fun should_returnEmptyList_whenAllCitiesDataQualityIsLow() {
        //given city with low data quality
        val expected = emptyList<Pair<String, Float>>()
        //when counting number of years needed to buy the apartment
        val result = GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyIt(dataLowQuality).execute()
        //then return empty list
        assertEquals(expected, result)
    }

    @Test
    fun should_returnSortedData_whenTheDataWithAllInformationNeeded() {
        //given city with all information needed
        val expected = listOf(Pair("Berlin", 1.6666666f), Pair("Madrid", 3.125f), Pair("Roma", 6.9444447f))
        //when counting number of years needed to buy the apartment
        val result = GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyIt(dataAllInformation).execute()
        //then return sorted list of cities with the number of needed years
        assertEquals(expected, result)
    }


}

