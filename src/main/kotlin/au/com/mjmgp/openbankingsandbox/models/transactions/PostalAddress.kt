package au.com.mjmgp.openbankingsandbox.models.transactions

data class PostalAddress(
    val AddressType: String? = null,
    val Department: String? = null,
    val SubDepartment: String? = null,
    val StreetName: String? = null,
    val BuildingNumber: String? = null,
    val PostCode: String? = null,
    val TownName: String? = null,
    val CountrySubDivision: String? = null,
    val Country: String? = null,
    val AddressLine: String? = null
)
