package au.com.mjmgp.openbankingsandbox.models.transactions

data class DebtorAgent(
    val SchemeName: String? = null,
    val Identification: String? = null,
    val Name: String? = null,
    val PostalAddress: PostalAddress? = null
)
