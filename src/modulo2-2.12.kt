fun main() {
    // ejercicio modulo 2-2.12

    // ejemplo basico
    val numbers = arrayOf(11, 12, 13, 14, 15)
    val stringsList = mutableListOf<String>()
    for (number in numbers) {
        stringsList.add(number.toString())
    }

    println(stringsList)

    // ejemplo desafio
    val divisibleBySeven = mutableListOf<Int>()

    for (i in 0..100 step 7) {
        divisibleBySeven.add(i)
    }

    println(divisibleBySeven)
}