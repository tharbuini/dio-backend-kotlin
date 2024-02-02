fun main() {
    // print("Insira um valor: ")
    // val input = readln()
    val input = 15

    val value: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }
    println(value)

    val a = 10
    val b = 0
    val divisao = try { a / b } catch (e: ArithmeticException) { 0 }
    println(divisao)
}