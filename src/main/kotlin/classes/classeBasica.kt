package classes
class Cliente () {
    var nome = "Joao"
}

fun main() {
    val cliente = Cliente()
    println(cliente.nome)
    cliente.nome = "Carlos Alberto"
    println(cliente.nome)
}