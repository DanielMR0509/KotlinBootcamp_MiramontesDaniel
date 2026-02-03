// ejercicio modulo 3-3.17

fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    val curries = spices
        .filter { it.contains("curry") }
        .sortedBy { it.length }

    println(curries) // [curry, red curry, green curry]

    spices.filter { it.startsWith('c') && it.endsWith('e') }
}