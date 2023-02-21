package interactor

import dataSource.FakeCsvDataSource

import dataSource.utils.CsvParser
import model.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import dataSource.CorrectData
import dataSource.NullableData
import dataSource.EmptyList
import org.junit.jupiter.api.function.Executable
import java.lang.Exception

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTheMostSuitableCityForSavingTest {
    lateinit var dataSource: CostOfLivingDataSource

    lateinit var nullData: CostOfLivingDataSource
    lateinit var correctData: CostOfLivingDataSource
    private lateinit var emptyList: CostOfLivingDataSource

    @BeforeAll
    fun setup() {
        correctData = CorrectData()
        nullData = NullableData()
        emptyList = EmptyList()

    }


    @Test
    fun should_ReturnTheCorrectCityEntity_when_execute() {
        //given Correct Data
        val correctCityEntity by lazy {
            CityEntity(
                cityName = "alexandria",
                country = "egypt",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 10f,
                    mealFor2PeopleMidRangeRestaurant = 5f,
                    mealAtMcDonaldSOrEquivalent = 3f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 7f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                    waterAThirdOfLiterBottleInRestaurants = 1f,
                    milkRegularOneLiter = 2f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.5f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2f,
                    banana1kg = 1f,
                    oranges1kg = 1f,
                    tomato1kg = 3f,
                    potato1kg = 1f,
                    onion1kg = 1f,
                    lettuceOneHead = 0.25f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = .5f,
                    riceWhite1kg = 1f,
                    eggsRegular12 = 2f,
                    localCheese1kg = 4f,
                    chickenFillets1kg = 4f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                    fitnessClubMonthlyFeeForOneAdult = 100f,
                    tennisCourtRentOneHourOnWeekend = 100f,
                    cinemaInternationalReleaseOneSeat = 10f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                    internationalPrimarySchoolYearlyForOneChild = 1000f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 60f,
                    oneSummerDressInAChainStoreZaraHAndM = 90f,
                    onePairOfNikeRunningShoesMidRange = 80f,
                    onePairOfMenLeatherBusinessShoes = 300f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 5f,
                    monthlyPassRegularPrice = 60f,
                    taxiStartNormalTariff = 20f,
                    taxi1kmNormalTariff = 30f,
                    taxi1hourWaitingNormalTariff = 60f,
                    gasolineOneLiter = 2f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 500f,
                    apartmentOneBedroomOutsideOfCentre = 300f,
                    apartment3BedroomsInCityCentre = 800f,
                    apartment3BedroomsOutsideOfCentre = 500f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 20f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 15f
                ),
                averageMonthlyNetSalaryAfterTax = 6000f,
                dataQuality = true
            )
        }
        val city = GetTheMostSuitableCityForSaving(correctData)
        //when find the most saving city
        val mostSavingCity = city.execute()
        //then compare with expected value
        assertEquals(correctCityEntity, mostSavingCity)
    }

    @Test
    fun should_ThrowException_When_ListIsEmpty() {
        //given empty list
        val city = GetTheMostSuitableCityForSaving(emptyList)
        //when check the emptyList
        val mostSavingCity = Executable { city.execute() }
        //then compare with expected value
        assertThrows(Exception::class.java, mostSavingCity)

        fun should_ReturnTheCorrectCityEntity_when_execute() {
            //given

            //when
            val expected = CityEntity(
                cityName = "Sri Jayewardenepura Kotte",
                country = "Sri Lanka",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.08f,
                    mealFor2PeopleMidRangeRestaurant = 6.78f,
                    mealAtMcDonaldSOrEquivalent = 4.34f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.99f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.27f,
                    waterAThirdOfLiterBottleInRestaurants = 0.21f,
                    milkRegularOneLiter = 0.91f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.34f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.8f,
                    banana1kg = 0.6f,
                    oranges1kg = 1.75f,
                    tomato1kg = 0.63f,
                    potato1kg = 0.81f,
                    onion1kg = 0.66f,
                    lettuceOneHead = 0.68f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.41f,
                    riceWhite1kg = 0.56f,
                    eggsRegular12 = 1.15f,
                    localCheese1kg = 6.07f,
                    chickenFillets1kg = 2.54f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 4.72f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 40.68f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 16.27f,
                    fitnessClubMonthlyFeeForOneAdult = 8.59f,
                    tennisCourtRentOneHourOnWeekend = 2.71f,
                    cinemaInternationalReleaseOneSeat = 2.44f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 14.92f,
                    internationalPrimarySchoolYearlyForOneChild = 903.96f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 26.1f,
                    oneSummerDressInAChainStoreZaraHAndM = 8.59f,
                    onePairOfNikeRunningShoesMidRange = 48.81f,
                    onePairOfMenLeatherBusinessShoes = 62.37f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.08f,
                    monthlyPassRegularPrice = 2.44f,
                    taxiStartNormalTariff = 0.27f,
                    taxi1kmNormalTariff = 0.2f,
                    taxi1hourWaitingNormalTariff = 0.46f,
                    gasolineOneLiter = 0.78f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 36610.46f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 26847.67f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 77.97f,
                    apartmentOneBedroomOutsideOfCentre = 33.45f,
                    apartment3BedroomsInCityCentre = 267.8f,
                    apartment3BedroomsOutsideOfCentre = 89.49f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 81.36f,
                dataQuality = false
            )
            val result = city.execute()
            //then
            assertEquals(expected, result)

        }

        @Test
        fun should_ThrowException_When_DataIsNull() {
            //given Null Data
            val city = GetTheMostSuitableCityForSaving(nullData)
            //when check data
            val mostSavingCity = Executable { city.execute() }
            //then compare with expected value
            assertThrows(Exception::class.java, mostSavingCity)
        }

    }
}




