package au.com.mjmgp.openbankingsandbox.models

import au.com.mjmgp.openbankingsandbox.models.transactions.TransactionData

data class TransactionWrapper(
    val Data: TransactionData? = null,
    val Links: Links? = null,
    val Meta: Meta? = null
)
