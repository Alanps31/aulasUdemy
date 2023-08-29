package operadores

fun main() {
    val a: Any = "123"

    if (a is String) {
        println("É uma string")
    } else if (a !is String) {
        println("nao e uma string")
    }
}