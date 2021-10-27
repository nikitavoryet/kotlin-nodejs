import controllers.crypto.CryptoController
import kotlin.test.*

class ExampleTest {
    private val crypto = CryptoController()
    @Test
    fun btcTest() {
        assertEquals(crypto.generateFakeRate("BTC")[0].name, "BTC")
    }

    @Test
    fun ethTest() {
        assertEquals(crypto.generateFakeRate("ETH")[0].name, "ETH")
    }

    @Test
    fun getAll() {
        val result = crypto.generateFakeRate()
        assertEquals(result[0].name, "BTC")
        assertEquals(result[1].name, "ETH")
    }

    @Test
    fun allSizeMoreOne() {
        val result = crypto.generateFakeRate("QQQ").size
        assertTrue(result > 0)
    }
}