// custom exception
class IllegalVotingException(message: String) : Throwable(message)

@Throws(IllegalVotingException::class)
fun vote(name: String, age: Int) {
    if (age < 16) {
        throw IllegalVotingException("Voto somente para maiores de 16 anos.")
    }
    println("Voto de $name realizado.")
}

fun main() {
    var quantidadeVotos = 0
    quantidadeVotos += try { vote("Thiago", 22); 1 } catch (e: IllegalVotingException) { 0 }
    quantidadeVotos += try { vote("Luana", 30); 1 } catch (e: IllegalVotingException) { 0 }
    quantidadeVotos += try { vote("João", 10); 1 } catch (e: IllegalVotingException) { 0 }

    println("Quantidade de votos: $quantidadeVotos")
}