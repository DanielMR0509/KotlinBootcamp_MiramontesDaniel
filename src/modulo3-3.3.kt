// ejercicio modulo 3-3.3

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {
    // ejercicio 1
    println("What day is it today?")

    // ejercicio 2
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(
        when (day) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "Error during the process of getting the day of the week"
        }
    )
}