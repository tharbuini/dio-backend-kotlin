class Configuration(val host: String, val port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) {
        println("$host:$port")
    }

    // alternative using "run":
    configuration.run {
        println("$host:$port")
    }

    // alternative using "let":
    configuration.let {
        println("${it.host}:${it.port}")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")
}