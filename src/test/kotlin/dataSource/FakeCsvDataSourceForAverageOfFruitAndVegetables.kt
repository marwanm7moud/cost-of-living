package dataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeCsvDataSourceForAverageOfFruitAndVegetables : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
       return listOf(
    CityEntity(
               cityName = "london",
               country = "england",
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
                   banana1kg = 2f,
                   oranges1kg = 1f,
                   tomato1kg = 3f,
                   potato1kg = 3f,
                   onion1kg = 1f,
                   lettuceOneHead = 0.25f
               ),
               foodPrices = FoodPrices(
                   loafOfFreshWhiteBread500g = 1f,
                   riceWhite1kg = 3f,
                   eggsRegular12 = 1f,
                   localCheese1kg = 6f,
                   chickenFillets1kg = 9f,
                   beefRound1kgOrEquivalentBackLegRedMeat = 12f
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
                   apartmentOneBedroomInCityCentre = 500000f,
                   apartmentOneBedroomOutsideOfCentre = 300000f,
                   apartment3BedroomsInCityCentre = 800000f,
                   apartment3BedroomsOutsideOfCentre = 500000f,
                   pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                   pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
               ),
               averageMonthlyNetSalaryAfterTax = 4000f,
               dataQuality = false
           ),
    CityEntity(
               cityName = "paris",
               country = "france",
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
                   apples1kg = 1f,
                   banana1kg = 1f,
                   oranges1kg = 1f,
                   tomato1kg = 1f,
                   potato1kg = 1f,
                   onion1kg = 1f,
                   lettuceOneHead = 0.25f
               ),
               foodPrices = FoodPrices(
                   loafOfFreshWhiteBread500g = 4f,
                   riceWhite1kg = 12f,
                   eggsRegular12 = 24f,
                   localCheese1kg = 9f,
                   chickenFillets1kg = 16f,
                   beefRound1kgOrEquivalentBackLegRedMeat = 20f
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
                   apartmentOneBedroomInCityCentre = 500000f,
                   apartmentOneBedroomOutsideOfCentre = 300000f,
                   apartment3BedroomsInCityCentre = 800000f,
                   apartment3BedroomsOutsideOfCentre = 500000f,
                   pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                   pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
               ),
               averageMonthlyNetSalaryAfterTax = 9000f,
               dataQuality = true
           ),
    CityEntity(
               cityName = "rabat",
               country = "morocco",
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
                   loafOfFreshWhiteBread500g = 9f,
                   riceWhite1kg = 4f,
                   eggsRegular12 = 3f,
                   localCheese1kg = 1f,
                   chickenFillets1kg = 12f,
                   beefRound1kgOrEquivalentBackLegRedMeat = null
               ),
               servicesPrices = ServicesPrices(
                   basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                   oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                   internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
                   apartmentOneBedroomInCityCentre = null,
                   apartmentOneBedroomOutsideOfCentre = null,
                   apartment3BedroomsInCityCentre = null,
                   apartment3BedroomsOutsideOfCentre = null,
                   pricePerSquareMeterToBuyApartmentInCityCentre = null,
                   pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
               ),
               averageMonthlyNetSalaryAfterTax = null,
               dataQuality = false
           ),
    CityEntity(
               cityName = "berlin",
               country = "germany",
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
                   banana1kg = 2f,
                   oranges1kg = 2f,
                   tomato1kg = 2f,
                   potato1kg = 2f,
                   onion1kg = 2f,
                   lettuceOneHead = 0.25f
               ),
               foodPrices = FoodPrices(
                   loafOfFreshWhiteBread500g = 9f,
                   riceWhite1kg = 4f,
                   eggsRegular12 = 3f,
                   localCheese1kg = 1f,
                   chickenFillets1kg = 12f,
                   beefRound1kgOrEquivalentBackLegRedMeat = 20f
               ),
               servicesPrices = ServicesPrices(
                   basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                   oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                   internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
                   apartmentOneBedroomInCityCentre = null,
                   apartmentOneBedroomOutsideOfCentre = null,
                   apartment3BedroomsInCityCentre = null,
                   apartment3BedroomsOutsideOfCentre = null,
                   pricePerSquareMeterToBuyApartmentInCityCentre = null,
                   pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
               ),
               averageMonthlyNetSalaryAfterTax = null,
               dataQuality = true
           ),
    CityEntity(
               cityName = "Ottawa",
               country = "Canada",
               mealsPrices = MealsPrices(
                   mealInexpensiveRestaurant = 40f,
                   mealFor2PeopleMidRangeRestaurant = 35f,
                   mealAtMcDonaldSOrEquivalent = 10f
               ),
               drinksPrices = DrinksPrices(
                   cappuccinoRegularInRestaurants = 7f,
                   cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                   waterAThirdOfLiterBottleInRestaurants = 1f,
                   milkRegularOneLiter = 2f,
                   waterOneAndHalfLiterBottleAtTheMarket = 2.5f
               ),
               fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                   apples1kg = 12f,
                   banana1kg = 12f,
                   oranges1kg = 12f,
                   tomato1kg = 12f,
                   potato1kg = 12f,
                   onion1kg = 1f,
                   lettuceOneHead = 0.25f
               ),
               foodPrices = FoodPrices(
                   loafOfFreshWhiteBread500g = 9f,
                   riceWhite1kg = 4f,
                   eggsRegular12 = 3f,
                   localCheese1kg = 1f,
                   chickenFillets1kg = 12f,
                   beefRound1kgOrEquivalentBackLegRedMeat = 20f
               ),
               servicesPrices = ServicesPrices(
                   basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                   oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                   internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
                   apartmentOneBedroomInCityCentre = 500000f,
                   apartmentOneBedroomOutsideOfCentre = 300000f,
                   apartment3BedroomsInCityCentre = 800000f,
                   apartment3BedroomsOutsideOfCentre = 500000f,
                   pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                   pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
               ),
               averageMonthlyNetSalaryAfterTax = 6000f,
               dataQuality = true
           ),
    CityEntity(
               cityName = "Washington",
               country = "United States",
               mealsPrices = MealsPrices(
                   mealInexpensiveRestaurant = 100f,
                   mealFor2PeopleMidRangeRestaurant = 60f,
                   mealAtMcDonaldSOrEquivalent = 30f
               ),
               drinksPrices = DrinksPrices(
                   cappuccinoRegularInRestaurants = 7f,
                   cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                   waterAThirdOfLiterBottleInRestaurants = 1f,
                   milkRegularOneLiter = 2f,
                   waterOneAndHalfLiterBottleAtTheMarket = 2.5f
               ),
               fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                   apples1kg = 10f,
                   banana1kg = 10f,
                   oranges1kg = 10f,
                   tomato1kg = 10f,
                   potato1kg = 10f,
                   onion1kg = 10f,
                   lettuceOneHead = 0.25f
               ),
               foodPrices = FoodPrices(
                   loafOfFreshWhiteBread500g = 9f,
                   riceWhite1kg = 4f,
                   eggsRegular12 = 3f,
                   localCheese1kg = 1f,
                   chickenFillets1kg = 12f,
                   beefRound1kgOrEquivalentBackLegRedMeat = 20f
               ),
               servicesPrices = ServicesPrices(
                   basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                   oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                   internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
                   apartmentOneBedroomInCityCentre = 500000f,
                   apartmentOneBedroomOutsideOfCentre = 300000f,
                   apartment3BedroomsInCityCentre = 800000f,
                   apartment3BedroomsOutsideOfCentre = 500000f,
                   pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                   pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
               ),
               averageMonthlyNetSalaryAfterTax = 6000f,
               dataQuality = true
           ),
    CityEntity(
               cityName = "Mexico",
               country = "Mexico",
               mealsPrices = MealsPrices(
                   mealInexpensiveRestaurant = 70f,
                   mealFor2PeopleMidRangeRestaurant = 35f,
                   mealAtMcDonaldSOrEquivalent = 25f
               ),
               drinksPrices = DrinksPrices(
                   cappuccinoRegularInRestaurants = 7f,
                   cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                   waterAThirdOfLiterBottleInRestaurants = 1f,
                   milkRegularOneLiter = 2f,
                   waterOneAndHalfLiterBottleAtTheMarket = 2.5f
               ),
               fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                   apples1kg =3f,
                   banana1kg =3f,
                   oranges1kg = 3f,
                   tomato1kg = 3f,
                   potato1kg = 3f,
                   onion1kg = 3f,
                   lettuceOneHead = 0.25f
               ),
               foodPrices = FoodPrices(
                   loafOfFreshWhiteBread500g = 9f,
                   riceWhite1kg = 4f,
                   eggsRegular12 = 3f,
                   localCheese1kg = 1f,
                   chickenFillets1kg = 12f,
                   beefRound1kgOrEquivalentBackLegRedMeat = 20f
               ),
               servicesPrices = ServicesPrices(
                   basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                   oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                   internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
                   apartmentOneBedroomInCityCentre = 500000f,
                   apartmentOneBedroomOutsideOfCentre = 300000f,
                   apartment3BedroomsInCityCentre = 800000f,
                   apartment3BedroomsOutsideOfCentre = 500000f,
                   pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                   pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
               ),
               averageMonthlyNetSalaryAfterTax = 6000f,
               dataQuality = true
           ),
    CityEntity(
               cityName = "Karachi", country = "Pakistan",
               mealsPrices = MealsPrices(
                   mealInexpensiveRestaurant = 2.24f,
                   mealFor2PeopleMidRangeRestaurant = 11.18f,
                   mealAtMcDonaldSOrEquivalent = 3.8f
               ),
               drinksPrices = DrinksPrices(
                   cappuccinoRegularInRestaurants = 1.41f,
                   cokePepsiAThirdOfLiterBottleInRestaurants = 0.29f,
                   waterAThirdOfLiterBottleInRestaurants = 0.19f,
                   milkRegularOneLiter = 0.8f,
                   waterOneAndHalfLiterBottleAtTheMarket = 0.35f
               ),
               fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                   apples1kg = 9f,
                   banana1kg = 9f,
                   oranges1kg = 9f,
                   tomato1kg = 99f,
                   potato1kg = 9f,
                   onion1kg = 9f,
                   lettuceOneHead = 0.25f
               ),
               foodPrices = FoodPrices(
                   loafOfFreshWhiteBread500g = 0.46f,
                   riceWhite1kg = 1.09f,
                   eggsRegular12 = 1.14f,
                   localCheese1kg = 4.88f,
                   chickenFillets1kg = 2.83f,
                   beefRound1kgOrEquivalentBackLegRedMeat = 4.02f
               ),
               servicesPrices = ServicesPrices(
                   basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 66.56f,
                   oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                   internet60MbpsOrMoreUnlimitedDataCableAdsl = 20.72f,
                   fitnessClubMonthlyFeeForOneAdult = 16.52f,
                   tennisCourtRentOneHourOnWeekend = 6.05f,
                   cinemaInternationalReleaseOneSeat = 4.47f,
                   preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 51.71f,
                   internationalPrimarySchoolYearlyForOneChild = 1183.26f
               ),
               clothesPrices = ClothesPrices(
                   onePairOfJeansLevis50oneOrSimilar = 14.55f,
                   oneSummerDressInAChainStoreZaraHAndM = 24.19f,
                   onePairOfNikeRunningShoesMidRange = 32.04f,
                   onePairOfMenLeatherBusinessShoes = 27.61f
               ),
               transportationsPrices = TransportationsPrices(
                   oneWayTicketLocalTransport = 0.22f,
                   monthlyPassRegularPrice = 11.18f,
                   taxiStartNormalTariff = 0.67f,
                   taxi1kmNormalTariff = 0.16f,
                   taxi1hourWaitingNormalTariff = 1.79f,
                   gasolineOneLiter = 1.05f
               ),
               carsPrices = CarsPrices(
                   volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 13857.85f,
                   toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 18980.66f
               ),
               realEstatesPrices = RealEstatesPrices(
                   apartmentOneBedroomInCityCentre = 113.5f,
                   apartmentOneBedroomOutsideOfCentre = 76.65f,
                   apartment3BedroomsInCityCentre = 268.71f,
                   apartment3BedroomsOutsideOfCentre = 170.09f,
                   pricePerSquareMeterToBuyApartmentInCityCentre = 760.64f,
                   pricePerSquareMeterToBuyApartmentOutsideOfCentre = 412.03f
               ),
               averageMonthlyNetSalaryAfterTax = 166.86f, dataQuality = true
           ),
    CityEntity(
           cityName = "Lahore", country = "Pakistan",
           mealsPrices = MealsPrices(
             mealInexpensiveRestaurant = 1.56f,
             mealFor2PeopleMidRangeRestaurant = 17.88f,
             mealAtMcDonaldSOrEquivalent = 3.58f
           ),
           drinksPrices = DrinksPrices(
             cappuccinoRegularInRestaurants = 1.81f,
             cokePepsiAThirdOfLiterBottleInRestaurants = 0.23f,
             waterAThirdOfLiterBottleInRestaurants = 0.17f,
             milkRegularOneLiter = 0.69f,
             waterOneAndHalfLiterBottleAtTheMarket = 0.31f
           ),
           fruitAndVegetablesPrices = FruitAndVegetablesPrices(
             apples1kg = 8f,
             banana1kg = 8f,
             oranges1kg = 8f,
             tomato1kg = 8f,
             potato1kg = 8f,
             onion1kg = 8f,
             lettuceOneHead = 0.27f
           ),
           foodPrices = FoodPrices(
             loafOfFreshWhiteBread500g = 0.67f,
             riceWhite1kg = 0.96f,
             eggsRegular12 = 1.05f,
             localCheese1kg = 5.72f,
             chickenFillets1kg = 2.83f,
             beefRound1kgOrEquivalentBackLegRedMeat = 3.88f
           ),
           servicesPrices = ServicesPrices(
             basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 92.43f,
             oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
             internet60MbpsOrMoreUnlimitedDataCableAdsl = 23.83f,
             fitnessClubMonthlyFeeForOneAdult = 16.09f,
             tennisCourtRentOneHourOnWeekend = 8.26f,
             cinemaInternationalReleaseOneSeat = 4.47f,
             preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 56.01f,
             internationalPrimarySchoolYearlyForOneChild = 1207.32f
           ),
           clothesPrices = ClothesPrices(
             onePairOfJeansLevis50oneOrSimilar = 14.48f,
             oneSummerDressInAChainStoreZaraHAndM = 25.47f,
             onePairOfNikeRunningShoesMidRange = 54.62f,
             onePairOfMenLeatherBusinessShoes = 37.77f
           ),
           transportationsPrices = TransportationsPrices(
             oneWayTicketLocalTransport = 0.18f,
             monthlyPassRegularPrice = 6.71f,
             taxiStartNormalTariff = 0.67f,
             taxi1kmNormalTariff = 0.22f,
             taxi1hourWaitingNormalTariff = 2.12f,
             gasolineOneLiter = 1.08f
           ),
           carsPrices = CarsPrices(
             volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 13410.82f,
             toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 18871.5f
           ),
           realEstatesPrices = RealEstatesPrices(
             apartmentOneBedroomInCityCentre = 112.52f,
             apartmentOneBedroomOutsideOfCentre = 70.74f,
             apartment3BedroomsInCityCentre = 244.49f,
             apartment3BedroomsOutsideOfCentre = 187.01f,
             pricePerSquareMeterToBuyApartmentInCityCentre = 465.59f,
             pricePerSquareMeterToBuyApartmentOutsideOfCentre = 306.08f
           ),
           averageMonthlyNetSalaryAfterTax = 164.01f, dataQuality = true
         ),
    CityEntity(
           cityName = "Dushanbe", country = "Tajikistan",
           mealsPrices = MealsPrices(
             mealInexpensiveRestaurant = 3.97f,
             mealFor2PeopleMidRangeRestaurant = 11.0f,
             mealAtMcDonaldSOrEquivalent = 4.96f
           ),
           drinksPrices = DrinksPrices(
             cappuccinoRegularInRestaurants = 1.2f,
             cokePepsiAThirdOfLiterBottleInRestaurants = 0.41f,
             waterAThirdOfLiterBottleInRestaurants = 0.28f,
             milkRegularOneLiter = 0.72f,
             waterOneAndHalfLiterBottleAtTheMarket = 0.43f
           ),
           fruitAndVegetablesPrices = FruitAndVegetablesPrices(
             apples1kg = 7f,
             banana1kg = 7f,
             oranges1kg = 7f,
             tomato1kg = 7f,
             potato1kg = 7f,
             onion1kg = 7f,
             lettuceOneHead = 0.25f
           ),
           foodPrices = FoodPrices(
             loafOfFreshWhiteBread500g = 0.41f,
             riceWhite1kg = 1.58f,
             eggsRegular12 = 1.56f,
             localCheese1kg = 5.77f,
             chickenFillets1kg = 3.9f,
             beefRound1kgOrEquivalentBackLegRedMeat = 6.84f
           ),
           servicesPrices = ServicesPrices(
             basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 31.26f,
             oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.02f,
             internet60MbpsOrMoreUnlimitedDataCableAdsl = 22.17f,
             fitnessClubMonthlyFeeForOneAdult = 34.86f,
             tennisCourtRentOneHourOnWeekend = 11.17f,
             cinemaInternationalReleaseOneSeat = 5.21f,
             preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 84.39f,
             internationalPrimarySchoolYearlyForOneChild = 4964.41f
           ),
           clothesPrices = ClothesPrices(
             onePairOfJeansLevis50oneOrSimilar = 32.26f,
             oneSummerDressInAChainStoreZaraHAndM = 24.07f,
             onePairOfNikeRunningShoesMidRange = 53.36f,
             onePairOfMenLeatherBusinessShoes = 52.12f
           ),
           transportationsPrices = TransportationsPrices(
             oneWayTicketLocalTransport = 0.25f,
             monthlyPassRegularPrice = 6.95f,
             taxiStartNormalTariff = 0.99f,
             taxi1kmNormalTariff = 0.3f,
             taxi1hourWaitingNormalTariff = 2.38f,
             gasolineOneLiter = 0.94f
           ),
           carsPrices = CarsPrices(
             volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 14392.29f,
             toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 21839.84f
           ),
           realEstatesPrices = RealEstatesPrices(
             apartmentOneBedroomInCityCentre = 376.03f,
             apartmentOneBedroomOutsideOfCentre = 186.15f,
             apartment3BedroomsInCityCentre = 631.14f,
             apartment3BedroomsOutsideOfCentre = 330.47f,
             pricePerSquareMeterToBuyApartmentInCityCentre = 835.59f,
             pricePerSquareMeterToBuyApartmentOutsideOfCentre = 381.24f
           ),
           averageMonthlyNetSalaryAfterTax = 163.81f, dataQuality = true
         ),
    CityEntity(
           cityName = "Alexandria", country = "Egypt",
           mealsPrices = MealsPrices(
             mealInexpensiveRestaurant = 4.07f,
             mealFor2PeopleMidRangeRestaurant = 16.28f,
             mealAtMcDonaldSOrEquivalent = 3.66f
           ),
           drinksPrices = DrinksPrices(
             cappuccinoRegularInRestaurants = 1.39f,
             cokePepsiAThirdOfLiterBottleInRestaurants = 0.25f,
             waterAThirdOfLiterBottleInRestaurants = 0.15f,
             milkRegularOneLiter = 0.76f,
             waterOneAndHalfLiterBottleAtTheMarket = 0.21f
           ),
           fruitAndVegetablesPrices = FruitAndVegetablesPrices(
             apples1kg = .07f,
             banana1kg = 0.61f,
             oranges1kg = 0.4f,
             tomato1kg = 0.36f,
             potato1kg = 0.34f,
             onion1kg = 0.26f,
             lettuceOneHead = 0.22f
           ),
           foodPrices = FoodPrices(
             loafOfFreshWhiteBread500g = 0.45f,
             riceWhite1kg = 0.64f,
             eggsRegular12 = 1.11f,
             localCheese1kg = 2.69f,
             chickenFillets1kg = 3.64f,
             beefRound1kgOrEquivalentBackLegRedMeat = 7.24f
           ),
           servicesPrices = ServicesPrices(
             basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 21.56f,
             oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
             internet60MbpsOrMoreUnlimitedDataCableAdsl = 12.1f,
             fitnessClubMonthlyFeeForOneAdult = 20.93f,
             tennisCourtRentOneHourOnWeekend = 5.97f,
             cinemaInternationalReleaseOneSeat = 4.07f,
             preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 70.05f,
             internationalPrimarySchoolYearlyForOneChild = 2189.93f
           ),
           clothesPrices = ClothesPrices(
             onePairOfJeansLevis50oneOrSimilar = 27.17f,
             oneSummerDressInAChainStoreZaraHAndM = 33.63f,
             onePairOfNikeRunningShoesMidRange = 80.67f,
             onePairOfMenLeatherBusinessShoes = 39.98f
           ),
           transportationsPrices = TransportationsPrices(
             oneWayTicketLocalTransport = 0.2f,
             monthlyPassRegularPrice = 9.77f,
             taxiStartNormalTariff = 0.41f,
             taxi1kmNormalTariff = 0.2f,
             taxi1hourWaitingNormalTariff = 2.03f,
             gasolineOneLiter = 0.37f
           ),
           carsPrices = CarsPrices(
             volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20348.95f,
             toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 19766.46f
           ),
           realEstatesPrices = RealEstatesPrices(
             apartmentOneBedroomInCityCentre = 142.44f,
             apartmentOneBedroomOutsideOfCentre = 82.85f,
             apartment3BedroomsInCityCentre = 299.58f,
             apartment3BedroomsOutsideOfCentre = 175.24f,
             pricePerSquareMeterToBuyApartmentInCityCentre = 696.65f,
             pricePerSquareMeterToBuyApartmentOutsideOfCentre = 245.54f
           ),
           averageMonthlyNetSalaryAfterTax = 163.76f, dataQuality = true
         ),
    CityEntity(
           cityName = "Kampala", country = "Uganda",
           mealsPrices = MealsPrices(
             mealInexpensiveRestaurant = 1.74f,
             mealFor2PeopleMidRangeRestaurant = 26.79f,
             mealAtMcDonaldSOrEquivalent = 8.57f
           ),
           drinksPrices = DrinksPrices(
             cappuccinoRegularInRestaurants = 2.75f,
             cokePepsiAThirdOfLiterBottleInRestaurants = 0.48f,
             waterAThirdOfLiterBottleInRestaurants = 0.31f,
             milkRegularOneLiter = 0.77f,
             waterOneAndHalfLiterBottleAtTheMarket = 0.54f
           ),
           fruitAndVegetablesPrices = FruitAndVegetablesPrices(
             apples1kg = 5f,
             banana1kg = 5f,
             oranges1kg = 5f,
             tomato1kg = 5f,
             potato1kg = 5f,
             onion1kg = 5f,
             lettuceOneHead = .25f
           ),
           foodPrices = FoodPrices(
             loafOfFreshWhiteBread500g = 1.1f,
             riceWhite1kg = 1.15f,
             eggsRegular12 = 1.63f,
             localCheese1kg = 4.35f,
             chickenFillets1kg = 4.53f,
             beefRound1kgOrEquivalentBackLegRedMeat = 4.35f
           ),
           servicesPrices = ServicesPrices(
             basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 52.24f,
             oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.1f,
             internet60MbpsOrMoreUnlimitedDataCableAdsl = 57.43f,
             fitnessClubMonthlyFeeForOneAdult = 59.16f,
             tennisCourtRentOneHourOnWeekend = 14.19f,
             cinemaInternationalReleaseOneSeat = 5.36f,
             preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 192.01f,
             internationalPrimarySchoolYearlyForOneChild = 5074.13f
           ),
           clothesPrices = ClothesPrices(
             onePairOfJeansLevis50oneOrSimilar = 16.99f,
             oneSummerDressInAChainStoreZaraHAndM = 21.21f,
             onePairOfNikeRunningShoesMidRange = 49.24f,
             onePairOfMenLeatherBusinessShoes = 59.78f
           ),
           transportationsPrices = TransportationsPrices(
             oneWayTicketLocalTransport = 1.07f,
             monthlyPassRegularPrice = 41.53f,
             taxiStartNormalTariff = 1.07f,
             taxi1kmNormalTariff = 0.54f,
             taxi1hourWaitingNormalTariff = 2.68f,
             gasolineOneLiter = 1.4f
           ),
           carsPrices = CarsPrices(
             volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 10716.62f,
             toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 10165.48f
           ),
           realEstatesPrices = RealEstatesPrices(
             apartmentOneBedroomInCityCentre = 326.52f,
             apartmentOneBedroomOutsideOfCentre = 160.75f,
             apartment3BedroomsInCityCentre = 1013.26f,
             apartment3BedroomsOutsideOfCentre = 408.57f,
             pricePerSquareMeterToBuyApartmentInCityCentre = 1264.36f,
             pricePerSquareMeterToBuyApartmentOutsideOfCentre = 4819.16f
           ),
           averageMonthlyNetSalaryAfterTax = 162.31f, dataQuality = true
         ),
    CityEntity(
           cityName = "Hyderabad", country = "Pakistan",
           mealsPrices = MealsPrices(
             mealInexpensiveRestaurant = 1.23f,
             mealFor2PeopleMidRangeRestaurant = 15.65f,
             mealAtMcDonaldSOrEquivalent = 4.02f
           ),
           drinksPrices = DrinksPrices(
             cappuccinoRegularInRestaurants = 0.97f,
             cokePepsiAThirdOfLiterBottleInRestaurants = 0.28f,
             waterAThirdOfLiterBottleInRestaurants = 0.22f,
             milkRegularOneLiter = 0.63f,
             waterOneAndHalfLiterBottleAtTheMarket = 0.3f
           ),
           fruitAndVegetablesPrices = FruitAndVegetablesPrices(
             apples1kg = 4f,
             banana1kg = 4f,
             oranges1kg = 4f,
             tomato1kg = 4f,
             potato1kg = 4f,
             onion1kg = 4f,
             lettuceOneHead = 0.25f
           ),
           foodPrices = FoodPrices(
             loafOfFreshWhiteBread500g = 0.38f,
             riceWhite1kg = 0.69f,
             eggsRegular12 = 1.08f,
             localCheese1kg = 6.63f,
             chickenFillets1kg = 2.11f,
             beefRound1kgOrEquivalentBackLegRedMeat = 3.16f
           ),
           servicesPrices = ServicesPrices(
             basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 61.09f,
             oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.02f,
             internet60MbpsOrMoreUnlimitedDataCableAdsl = 15.65f,
             fitnessClubMonthlyFeeForOneAdult = 13.75f,
             tennisCourtRentOneHourOnWeekend = 7.26f,
             cinemaInternationalReleaseOneSeat = 2.24f,
             preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 10.73f,
             internationalPrimarySchoolYearlyForOneChild = 670.54f
           ),
           clothesPrices = ClothesPrices(
             onePairOfJeansLevis50oneOrSimilar = 25.15f,
             oneSummerDressInAChainStoreZaraHAndM = 16.76f,
             onePairOfNikeRunningShoesMidRange = 34.27f,
             onePairOfMenLeatherBusinessShoes = 35.02f
           ),
           transportationsPrices = TransportationsPrices(
             oneWayTicketLocalTransport = 0.18f,
             monthlyPassRegularPrice = 2.68f,
             taxiStartNormalTariff = 0.67f,
             taxi1kmNormalTariff = 0.18f,
             taxi1hourWaitingNormalTariff = 1.3f,
             gasolineOneLiter = 0.71f
           ),
           carsPrices = CarsPrices(
             volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 10952.17f,
             toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 15645.95f
           ),
           realEstatesPrices = RealEstatesPrices(
             apartmentOneBedroomInCityCentre = 70.03f,
             apartmentOneBedroomOutsideOfCentre = 43.96f,
             apartment3BedroomsInCityCentre = 149.01f,
             apartment3BedroomsOutsideOfCentre = 80.46f,
             pricePerSquareMeterToBuyApartmentInCityCentre = 181.04f,
             pricePerSquareMeterToBuyApartmentOutsideOfCentre = 206.28f
           ),
           averageMonthlyNetSalaryAfterTax = 161.67f, dataQuality = true
         )

       )
    }
}