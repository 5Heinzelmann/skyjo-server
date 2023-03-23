package digital.heinzelmann

import digital.heinzelmann.plugins.configureDatabases
import digital.heinzelmann.plugins.configureRouting
import digital.heinzelmann.plugins.configureSerialization
import digital.heinzelmann.plugins.configureSockets
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureSockets()
    configureRouting()
}
