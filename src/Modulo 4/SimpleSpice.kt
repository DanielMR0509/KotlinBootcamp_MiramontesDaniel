// ejercicio del modulo 4-4.3

class SimpleSpice {
    var name: String = "curry"
    var spiciness: String = "mild"

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                "medium" -> 10
                "hot" -> 15
                else -> 0
            }
        }
}

fun main() {
    val mySpice = SimpleSpice()
    println("Spice: ${mySpice.name}, Heat level: ${mySpice.heat}")
}