fun main() {
    loop@for(i in 1..10){
        for (j in 1..10){
            if (i == 2 && j == 3) break@loop
            println("valor I: $i Valor J: $j")
        }
    }
}