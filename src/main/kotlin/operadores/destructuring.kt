package operadores

data class Aluno(val nome: String)

fun main() {

    val (nome) = Aluno("Alan Pinheiro")

    println(nome)

}