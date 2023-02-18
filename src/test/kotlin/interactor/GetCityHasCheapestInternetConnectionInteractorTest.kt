package interactor

import dataSource.FakeCsvDataSourceForCityCheapestInternet
import dataSource.FakeCsvDataSourceForCityCheapestInternetEmptyList
import dataSource.FakeCsvDataSourceForCityCheapestInternetWithNullInternetPrice
import dataSource.FakeCsvDataSourceForCityCheapestInternetWithNullSalaries
import model.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import java.lang.Exception

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    lateinit var fakeCsvDataSourceForCityCheapestInternet: CostOfLivingDataSource
    lateinit var fakeCsvDataSourceEmptyList: CostOfLivingDataSource
    lateinit var fakeCsvDataSourceNullSalaries: CostOfLivingDataSource
    lateinit var fakeCsvDataSourceNullInternetPrice: CostOfLivingDataSource

    @BeforeAll
    fun setup(){
        fakeCsvDataSourceForCityCheapestInternet  = FakeCsvDataSourceForCityCheapestInternet()
        fakeCsvDataSourceEmptyList  = FakeCsvDataSourceForCityCheapestInternetEmptyList()
        fakeCsvDataSourceNullSalaries  = FakeCsvDataSourceForCityCheapestInternetWithNullSalaries()
        fakeCsvDataSourceNullInternetPrice  = FakeCsvDataSourceForCityCheapestInternetWithNullInternetPrice()
    }

    @Test
    fun should_ReternTheCorrectCity_when_Execute() {
        // given the expected city
        val expected = CityEntity(
            cityName = "Ras Ghareb",
            country = "Egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = null,
                mealFor2PeopleMidRangeRestaurant =null ,
                mealAtMcDonaldSOrEquivalent = null
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = null,
                cokePepsiAThirdOfLiterBottleInRestaurants = null,
                waterAThirdOfLiterBottleInRestaurants =null ,
                milkRegularOneLiter =null ,
                waterOneAndHalfLiterBottleAtTheMarket = null,
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = null,
                banana1kg = null,
                oranges1kg = null,
                potato1kg = null,
                tomato1kg = null,
                onion1kg = null,
                lettuceOneHead = null
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = null,
                riceWhite1kg = null,
                eggsRegular12 = null,
                localCheese1kg = null,
                chickenFillets1kg = null,
                beefRound1kgOrEquivalentBackLegRedMeat = null
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 5f,
                fitnessClubMonthlyFeeForOneAdult = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                internationalPrimarySchoolYearlyForOneChild = null
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = null,
                oneSummerDressInAChainStoreZaraHAndM = null,
                onePairOfNikeRunningShoesMidRange = null,
                onePairOfMenLeatherBusinessShoes = null
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = null,
                monthlyPassRegularPrice = null,
                taxiStartNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                taxi1kmNormalTariff = null,
                gasolineOneLiter = null
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = null,
                apartment3BedroomsInCityCentre = null,
                apartment3BedroomsOutsideOfCentre = null,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = 1000f,
            dataQuality = true
        )
        // when execute
        val result = GetCityHasCheapestInternetConnectionInteractor(fakeCsvDataSourceForCityCheapestInternet).execute()
        // then should be equal
        assertEquals(expected,result)

    }

    @Test
    fun should_ThrowException_when_ExecuteWithEmptyList() {
        // when execute
        val result = org.junit.jupiter.api.function.Executable {
               GetCityHasCheapestInternetConnectionInteractor(fakeCsvDataSourceEmptyList).execute()
        }
        // then should be equal
        assertThrows(Exception::class.java ,result)

    }
    @Test
    fun should_ThrowException_when_ExecuteAllCitiesNullSalary() {
        // when execute
        val result = org.junit.jupiter.api.function.Executable {
            GetCityHasCheapestInternetConnectionInteractor(fakeCsvDataSourceNullSalaries).execute()
        }
        // then should be equal
        assertThrows(Exception::class.java ,result)

    }
    @Test
    fun should_ThrowException_when_ExecuteAllCitiesNullInternet() {
        // when execute
        val result = org.junit.jupiter.api.function.Executable {
            GetCityHasCheapestInternetConnectionInteractor(fakeCsvDataSourceNullInternetPrice).execute()
        }
        // then should be equal
        assertThrows(Exception::class.java ,result)

    }
}