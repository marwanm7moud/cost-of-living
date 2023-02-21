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




