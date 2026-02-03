// ejercicio modulo 4-4.12

data class Spice(val name: String, val spiciness: String)

data class SpiceContainer(val spice: Spice) {
    val label: String = spice.name
}

fun main() {
    val curry = Spice("Curry", "mild")
    val pepper = Spice("Black Pepper", "medium")
    val cayenne = Spice("Cayenne", "hot")

    val container1 = SpiceContainer(curry)
    val container2 = SpiceContainer(pepper)
    val container3 = SpiceContainer(cayenne)

    println("Container 1 label: ${container1.label}")
    println("Container 2 label: ${container2.label}")
    println("Container 3 label: ${container3.label}")

    println(container1)
}