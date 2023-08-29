package operadores

fun main() {
    print(obterResultado(7.0))
}
// return está implícito nesta linha abaixo
fun obterResultado(nota: Double) : String = if (nota >= 7) "Aprovado" else "Reprovado"

