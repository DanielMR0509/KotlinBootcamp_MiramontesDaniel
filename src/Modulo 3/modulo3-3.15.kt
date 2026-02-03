// ejercicio modulo 3-3.15

fun main(args: Array<String>) {
    print("How is your mood today? ")
    val userMood = readLine()!!
    println(whatShouldIDoToday(userMood))
}

fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun isSadRainyCold(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isVeryHot(temperature: Int) = temperature > 35
fun isBoredSunny(mood: String, weather: String) = mood == "bored" && weather == "sunny"
fun isTooCold(temperature: Int) = temperature < 5

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        isHappySunny(mood, weather) -> "go for a walk"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isVeryHot(temperature) -> "go swimming"
        isBoredSunny(mood, weather) -> "do some coding in the garden"
        isTooCold(temperature) -> "make some hot chocolate"
        else -> "Stay home and read."
    }
}