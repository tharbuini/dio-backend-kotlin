data class Person0(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {
    val jake = Person0()
    println(jake)

    val stringDescription = jake.apply {
        name = "Jake" // jake.name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()

    println(stringDescription)
    println(jake)
}