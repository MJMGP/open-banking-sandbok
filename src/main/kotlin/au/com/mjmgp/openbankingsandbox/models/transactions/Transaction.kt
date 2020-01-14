package au.com.mjmgp.openbankingsandbox.models.transactions

data class Transaction(
        val AccountId: String? = null,
        val TransactionId: String? = null,
        val TransactionReference: String? = null,
        val StatementReference: String? = null,
        val CreditDebtIndicator: String? = null,
        val Status: String? = null,
        val BookingDateTime: String? = null,
        val ValueDateTime: String? = null,
        val TransactionInformation: String? = null,
        val AddressLine: String? = null,
        val Amount: Amount? = null,
        val ChargeAmount: ChargeAmount? = null,
        val CurrencyExchange: CurrencyExchange? = null,
        val BankTransactionCode: BankTransactionCode? = null,
        val ProprietaryBankTransactionCode: PropietaryBankTransactionCode? = null,
        val Balance: Balance? = null,
        val MerchantDetails: MerchantDetails? = null,
        val CreditorAgent: CreditorAgent? = null,
        val CreditorAccount: CreditorAccount? = null,
        val DebtorAgent: DebtorAgent? = null,
        val DebtorAccount: DebtorAccount? = null,
        val CardInstrument: CardInstrument? = null
)
