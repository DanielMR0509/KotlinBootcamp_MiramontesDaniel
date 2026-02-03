// ejercicio modulo 4-4.10

package Spices

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "yellow"
}

abstract class Spice(
    val name: String,
    val spiciness: String = "mild",
    color: SpiceColor = YellowSpiceColor
) : SpiceColor by color {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            else -> 0
        }

    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

class Curry(
    spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice("Curry", spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding the curry...")
    }
}

fun main() {
    delegate()
}

fun delegate() {

    val myCurry = Curry("medium")
        println("The spice ${myCurry.name} has color: ${myCurry.color}")
    myCurry.prepareSpice()
}