// ejercicio modulo 3-3.13

fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad", "rainy", 0))
    println(whatShouldIDoToday("bored", temperature = 35))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }
}