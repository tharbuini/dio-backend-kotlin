fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

class Animal(val name: String)

// allows the class Zoo to be iterated
class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {

    // loop using for
    val cities = listOf("New York", "Los Angeles", "Las Vegas")

    for (city in cities) {
        println("We are going on a trip to $city!")

        if (city == "Las Vegas") {
            println("La ciudad de los casinos")
        }
    }

    // loop using while and do-while
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten ++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    // iterators
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion"), Animal("snake"), Animal("giraffe")))

    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }
}

