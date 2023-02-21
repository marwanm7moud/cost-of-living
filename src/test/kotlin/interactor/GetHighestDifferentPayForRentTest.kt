package interactor

import dataSource.FakeCsvDataSourceForHighestDifferentPayForRent
import dataSource.FakeCsvDataSourceForHighestDifferentPayForRentWithEmptyList
import model.*
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Assertions.assertThrows

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetHighestDifferentPayForRentTest {
    lateinit var dataSource: FakeCsvDataSourceForHighestDifferentPayForRent
    lateinit var emptyList: FakeCsvDataSourceForHighestDifferentPayForRentWithEmptyList
    @BeforeAll
    fun setup(){
        dataSource  =FakeCsvDataSourceForHighestDifferentPayForRent()
        emptyList=FakeCsvDataSourceForHighestDifferentPayForRentWithEmptyList()
    }
    @Test
    fun should_ThrowException_WhenBothApartmentOneBedroomAndThreeBedRoomIsFalse(){
        // given apartmentOneBedroom is false And apartment3Bedrooms is false
        val apartmentOneBedroom=false
        val apartment3Bedrooms=false
        // when check on apartmentOneBedroom is false and apartment3Bedrooms is false mean go to else
        val result= org.junit.jupiter.api.function.Executable {
            GetHighestDifferentPayForRent(dataSource).execute(apartmentOneBedroom,
                apartment3Bedrooms)
        }

        //then return null
        assertThrows(Exception::class.java,result)
    }

    @Test
    fun should_ReturnTheCorrectCityName_whenHasLargestPayForBoth(){
        //given
        val apartmentOneBedroom=true
        val apartment3Bedrooms=true
        val expected=   CityEntity(
            cityName = "Beni Suef",
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
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 10f,
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
                apartmentOneBedroomInCityCentre = 6000f,
                apartmentOneBedroomOutsideOfCentre = 5000f,
                apartment3BedroomsInCityCentre = 12000f,
                apartment3BedroomsOutsideOfCentre = 10000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = 1000f,
            dataQuality = true
        )
        //when
        val result=GetHighestDifferentPayForRent(dataSource).execute(apartmentOneBedroom,apartment3Bedrooms)
        //then not return null
        assertEquals(expected.cityName, result)
    }
    @Test
    fun should_ReturnTheCorrectCityName_whenHasLargestPayForThreeBedrooms(){
        //given make apartmentOneBedrooms false to get highest pay for 3 bedroom
        val apartmentOneBedroom=false
        val apartment3Bedrooms=true
        val expected=   CityEntity(
            cityName = "Beni Suef",
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
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 10f,
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
                apartmentOneBedroomInCityCentre = 6000f,
                apartmentOneBedroomOutsideOfCentre = 5000f,
                apartment3BedroomsInCityCentre = 12000f,
                apartment3BedroomsOutsideOfCentre = 10000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = 1000f,
            dataQuality = true
        )
        //when apartment3Bedroom true  return highest pay for 3 bedroom
        val result=GetHighestDifferentPayForRent(dataSource).execute(apartmentOneBedroom,apartment3Bedrooms)
        //then  return city that has highest pay for three bedroom
        assertEquals(expected.cityName, result)
    }
    @Test
    fun should_ReturnTheCorrectCityName_whenHasLargestPayForOneBedrooms(){
        //given make apartment3Bedrooms false to get highest pay for one bedroom
        // so we make apartmentOneBedroom true
        val apartmentOneBedroom=true
        val apartment3Bedrooms=false
        val expected=  CityEntity(
            cityName = "al-Minya",
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
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 10f,
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
                apartmentOneBedroomInCityCentre = 3000f,
                apartmentOneBedroomOutsideOfCentre = 1500f,
                apartment3BedroomsInCityCentre = 9000f,
                apartment3BedroomsOutsideOfCentre = 8000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = 1000f,
            dataQuality = true
        )
        //when apartmentOneBedroom true  return highest pay for one bedroom
        val result=GetHighestDifferentPayForRent(dataSource).execute(apartmentOneBedroom,apartment3Bedrooms)
        //then return city that has highest pay
        assertEquals(expected.cityName, result)
    }
    @Test
    fun should_ThrowException_whenDataSourceIsEmpty(){
        //given make apartment3Bedrooms true and apartmentOneBedroom is true
        val apartmentOneBedroom=true
        val apartment3Bedrooms=true
        //when use data source with empty list
        val result= org.junit.jupiter.api.function.Executable {
            GetHighestDifferentPayForRent(emptyList).execute(apartmentOneBedroom,
                apartment3Bedrooms)
        }
        //then return null
        assertThrows(Exception::class.java,result)
    }
}
