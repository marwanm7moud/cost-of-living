package interactor

import model.CityEntity

class  GetHighestDifferentPayForRent (
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(
        apartmentOneBedroom: Boolean,
        apartmentThreeBedrooms: Boolean,
    ): String? {
        return if(apartmentOneBedroom||apartmentThreeBedrooms) {
            dataSource.getAllCitiesData()
                .filter(::excludeHighQualityDataAndNullable)
                .sortedByDescending {
                    it.findHighestDifferentInCitiesRent(apartmentOneBedroom,
                        apartmentThreeBedrooms)
                }
                //  .takeIf { apartmentThreeBedrooms || apartmentOneBedroom }
                .map { it.cityName }.run {
                    if (isEmpty()) {
                        throw  Exception("")
                    } else first()
                }
        }
        else throw  Exception("")
    }
    private fun excludeHighQualityDataAndNullable(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null &&
                city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null &&
                city.realEstatesPrices.apartmentOneBedroomInCityCentre != null &&
                city.realEstatesPrices.apartment3BedroomsInCityCentre != null &&
                city.dataQuality
    }
    private fun CityEntity.findHighestDifferentInCitiesRent(
        apartmentOneBedroom: Boolean,
        apartmentThreeBedrooms: Boolean
    ): Float {
        if (apartmentOneBedroom && !apartmentThreeBedrooms)
            return kotlin.math.abs(
                realEstatesPrices.apartmentOneBedroomInCityCentre!!
                        - realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
            )
        else if (apartmentThreeBedrooms && !apartmentOneBedroom)
            return kotlin.math.abs(
                realEstatesPrices.apartment3BedroomsInCityCentre!!
                        - realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
            )
        else if (apartmentThreeBedrooms && apartmentOneBedroom) (
                return kotlin.math.abs(
                    realEstatesPrices.apartmentOneBedroomInCityCentre!!
                            - realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
                ) +
                        kotlin.math.abs(
                            realEstatesPrices.apartment3BedroomsInCityCentre!!
                                    - realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
                        )
                )
        else return 0f
    }
}