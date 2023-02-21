package interactor

class GetCitiesNamesRepeatedMoreThanTwoTimes(private val dataSource: CostOfLivingDataSource) {
    /**
     *  how many cities names that repeated more than 2 times in different countries
     * (include Low quality data)
     */
    fun execute(limit: Int = 5): List<String> {
        return dataSource
            .getAllCitiesData()
            .groupBy { it.cityName }
            .filter { it.value.size > 2 }
            .map{it.key}.take(limit)
    }

}