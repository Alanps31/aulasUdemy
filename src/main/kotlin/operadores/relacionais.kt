package operadores

import java.util.Date

fun main() {
    println("banana" === "banana")
    println(3 !== 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)
    println("Resultado com ==: ${d1 == d2}")
    println("Resultado com ===: ${d1 === d2}")
}