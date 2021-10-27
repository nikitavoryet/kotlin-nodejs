import controllers.crypto.Crypto

external fun require(module: String): dynamic
val express = require("express")

/**
 * @description - Main variable with express package
 */
val app = express()

fun main() {
    Crypto().init()

    listen()
}

/**
 * @description - Method for staring server after create Controllers
 */
fun listen(port: Number = 3000) {
    app.listen(port) {
        println("Listening on port $port")
    }
}