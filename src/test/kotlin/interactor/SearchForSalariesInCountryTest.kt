package interactor

import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import interactor.CostOfLivingDataSource
import model.CityEntity
import org.junit.jupiter.api.TestInstance
import java.io.File
import java.io.IOException
import java.lang.Exception
import java.lang.reflect.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

internal class SearchForSalariesInCountryTest {

    lateinit var dataSource: CostOfLivingDataSource
    lateinit var getSalaryAverageAndCitiesNames: SearchForSalariesInCountry

    @BeforeAll
    fun setup() {
        dataSource = FakeCsvDataSource()
        getSalaryAverageAndCitiesNames = SearchForSalariesInCountry(dataSource)
    }
}