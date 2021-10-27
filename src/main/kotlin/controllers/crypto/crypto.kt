package controllers.crypto

import app

class Crypto {
    private val cryptoController = CryptoController()

    /**
     * @description - Main method for initial API
     */
    fun init() {
        createControllers()
    }

    /**
     * @description - Generate API with use .kt controller
     */
    private fun createControllers() {
        app.get("/getCryptoFakeRate") { req, res ->
            val code = req?.query?.code
            res.send(cryptoController.generateFakeRate(code))
        }
    }
}


