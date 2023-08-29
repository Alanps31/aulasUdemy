package operadores

fun main() {
    val a = 1 //API infere que o dado informado é um inteiro
    println(1 + 1) //em vez de concatenar ele soma
    println(a.toString() + 1) //digo a API que quero transformar em String e concateno
    println("1.9".toDoubleOrNull()) //interpolo a string em Double
    println("1,9".toDoubleOrNull() ?: 0.0) //interpolo a String, mas devido a "," passa a ser 0 com o elvis operator
}