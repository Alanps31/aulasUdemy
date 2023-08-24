package operadores

fun main() {
    val firstNumber = 3.0
    val secondNumber = 5.0

    println("Primeiro Numero: $firstNumber Segundo Numero: $secondNumber" )
    println("soma ${soma(firstNumber, secondNumber)}")
    println("Subtração ${subtract(firstNumber,secondNumber)}")
    println("Multiplicação: ${multiplication(firstNumber,secondNumber)}")
    println("Divisão ${division(firstNumber, secondNumber)}")

}

fun soma(firstNumber: Double, secondNumber: Double): Double {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Double, secondNumber: Double): Double {
    return firstNumber - secondNumber
}

fun multiplication(firstNumber: Double, secondNumber: Double): Double {
    return firstNumber * secondNumber
}

fun division(firstNumber: Double, secondNumber: Double): Double {
    return firstNumber / secondNumber
}