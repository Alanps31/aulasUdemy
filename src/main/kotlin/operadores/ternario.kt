package operadores

fun main() {
    val nota: String = readln()
    val operador: String = if (nota.toDoubleOrNull()!! > 6.0) "Aprovado" else "Reprovado"
    println(operador)
}