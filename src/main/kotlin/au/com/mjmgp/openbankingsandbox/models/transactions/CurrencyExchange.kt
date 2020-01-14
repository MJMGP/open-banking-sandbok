package au.com.mjmgp.openbankingsandbox.models.transactions

data class CurrencyExchange(
    val SourceCurrency: String? = null,
    val TargetCurrency: String? = null,
    val UnitCurrency: String? = null,
    val ExchangeRate: String? = null,
    val ContractIdentification: String? = null,
    val QuotationDate: String? = null,
    val InstructedAmount: InstructedAmount? = null
)
