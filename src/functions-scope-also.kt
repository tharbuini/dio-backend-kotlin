data class Person1(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person1) {
    println("A new person ${p.name} was created.")
}

fun main() {
    val jake = Person1("Jake", 30, "Android developer")   // 1
    jake.also {                                          // 2
        writeCreationLog(it)                         // 3
    }
}