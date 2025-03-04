package interactor

import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCountriesEnforceHighTaxesOnDrinksTest {

    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var getCountriesEnforceHighTaxesOnDrinks: GetCountriesEnforceHighTaxesOnDrinks

    @BeforeAll
    fun setup(){
        dataSource  = FakeCsvDataSource()
        getCountriesEnforceHighTaxesOnDrinks = GetCountriesEnforceHighTaxesOnDrinks(dataSource)
    }

    @Test
    fun should_returnTop_10_countriesName_whenDataIsCorrect() {
        // when
        val result = getCountriesEnforceHighTaxesOnDrinks.execute()
        // result
        assertNotEquals(null, result)
    }
}