// ejercicio modulo 4-4.14

package Spices

enum class Color(val rgb: Int) {
    YELLOW(0xFFFF00), RED(0xFF0000), GREEN(0x00FF00)
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

sealed class Spice(
    val name: String,
    val spiciness: String = "mild",
    color: SpiceColor = YellowSpiceColor
) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(spiciness: String) : Spice("Curry", spiciness) {
    override fun prepareSpice() { println("Grinding curry...") }
}

class Cayenne(spiciness: String) : Spice("Cayenne", spiciness) {
    override fun prepareSpice() { println("Drying cayenne...") }
}