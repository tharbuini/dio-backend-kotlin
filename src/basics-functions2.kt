fun main() {
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Hello", "Salut", "Oi")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix("Hello", "Oi", "Salut", prefix = "Greeting: ")

    fun Log(vararg entries: String) {
        printAll(*entries)
    }
    Log("Hello", "Salut", "Oi")
}