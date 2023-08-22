fun main() {
    var opcao: Int = 0
    do {
        println("informe um numero >>")
        val line = readlnOrNull() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("voce escolheu a opcao >> $opcao")
    } while(opcao != -1)
}