// // ejercicio del modulo 3-3.9

fun main(args: Array<String>) {
    val birthday = getBirthday()
    val fortune = getFortune(birthday)
    println("Your fortune is: $fortune")
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readlnOrNull()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when (birthday) {
        28, 31 -> "You will find a hidden treasure today!"
        in 1..7 -> "The first week of the month brings you luck!"
        else -> fortunes[birthday % fortunes.size]
    }
}