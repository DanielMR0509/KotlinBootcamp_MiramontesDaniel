// ejercicio modulo 4-4.5

class Spice(val name: String, val spiciness: String = "mild") {

    init {
        println("Spice created: $name with spiciness level: $spiciness")
    }

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "burning" -> 10
            else -> 0
        }
}

fun makeSalt() = Spice("Salt", "mild")

fun main() {

    val spices = listOf(
        Spice("curry", "mild"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "very spicy"),
        makeSalt()
    )

    val mildSpices = spices.filter { it.heat <= 5 }

    println("\nSpices with heat level 5 or less:")
    mildSpices.forEach { println("${it.name} (${it.heat})") }
}