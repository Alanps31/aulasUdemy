package operadores

fun main() {
    iSmart("Alan")
}

fun iSmart(x: Any) {
    when(x) {
        is String -> println(x.uppercase())
        is Int -> println(x.plus(5))
        else -> println("Valor não válido")
    }
}