// ejercicio del modulo 3-3.5

fun main(args: Array<String>) {

    val hour = args[0].toInt()

    if (hour < 12) {
        println("Good morning, Kotlin")
    } else {
        println("Good night, Kotlin")
    }
}