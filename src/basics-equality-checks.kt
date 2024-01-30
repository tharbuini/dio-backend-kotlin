fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    var writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)
    println(authors === writers)

    writers = setOf("Twain", "Shakespeare", "Mozart")
    println(authors == writers)

}