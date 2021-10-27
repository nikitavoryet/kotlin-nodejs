package controllers.crypto

data class CryptoCurrency(var name: String, var price: Double, var pair: String, var sign: String = "$")

val cryptoCurrencyList = arrayOf<CryptoCurrency>(
    CryptoCurrency("BTC", 60768.63, "USD"),
    CryptoCurrency("ETH", 4210.93, "USD"),
)

/**
 * @description - Testing Java controller for send data client on JS
 */
class CryptoController {
    /**
     * @description - Fake method for get data with query params
     */
    fun generateFakeRate(code: String?): Array<CryptoCurrency> {
        var selected: List<CryptoCurrency>? = null;
        if (code != null) {
            if (code.isNotEmpty()) selected = cryptoCurrencyList.filter{ it.name === code }
        }
        return if (selected != null && selected.isNotEmpty()) {
            arrayOf(selected[0])
        } else cryptoCurrencyList
    }
}