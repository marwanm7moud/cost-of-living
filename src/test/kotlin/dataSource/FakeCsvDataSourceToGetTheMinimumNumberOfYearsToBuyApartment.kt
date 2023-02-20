package dataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeCsvDataSourceToGetTheMinimumNumberOfYearsToBuyApartment: CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            //low data quality
            CityEntity(
            cityName = "Cairo",
            "Egypt",
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
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 50f,
                ),
                averageMonthlyNetSalaryAfterTax = 50f ,
                false
        )

            )

    }
}
class FakeCsvDataSourceToGetDataWithHighNoMeterPrice: CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            CityEntity(
                //null meter price
                    cityName = "Casablanca",
                    "Morocco",
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
                        apartment3BedroomsInCityCentre = null,
                        apartment3BedroomsOutsideOfCentre = null,
                        apartmentOneBedroomInCityCentre = null,
                        apartmentOneBedroomOutsideOfCentre = null,
                        pricePerSquareMeterToBuyApartmentInCityCentre = null,
                        pricePerSquareMeterToBuyApartmentOutsideOfCentre = null,
                    ),
                    averageMonthlyNetSalaryAfterTax = 10f ,
                    true
                ),
            )



    }
}

class FakeCsvDataSourceToGetDataWithNoSalary: CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            //no salary
            CityEntity(
                cityName = "Khartoum",
                "Sudan",
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
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 50f,
                ),
                averageMonthlyNetSalaryAfterTax = null ,
                true
            )

        )

    }
}

class FakeCsvDataSourceToGetNeededData: CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            CityEntity(
                cityName = "Berlin",
                "Germany",
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
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 12f,
                ),
                averageMonthlyNetSalaryAfterTax = 60f ,
                true
            ),

            CityEntity(
                cityName = "Madrid",
                "Spain",
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
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 15f,
                ),
                averageMonthlyNetSalaryAfterTax = 40f ,
                true
            ),
            CityEntity(
                cityName = "Roma",
                "Italy",
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
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 75f,
                ),
                averageMonthlyNetSalaryAfterTax = 90f ,
                true
            )

        )

    }

}
class FakeCsvDataSourceWithNoData: CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf()
    }
}

