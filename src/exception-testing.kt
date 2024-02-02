fun main() {
    // throw Exception("Teste de exceção")

    val a = 10
    val b = 5

    try {
        val divisao = a / b
        println("Resultado: $divisao")
    } catch (e: ArithmeticException) {
        println("Erro de exceção aritmética")
    } catch (e: Throwable) {
        println("Erro: ${e.message}")
    } finally {
        println("Fim do try catch")
    }

}