package au.com.mjmgp.openbankingsandbox.models.transactions

data class Balance(
    val CreditDebitIndicator: String? = null,
    val Type: String? = null,
    val Amount: Amount? = null
)
