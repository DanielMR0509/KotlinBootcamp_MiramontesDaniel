// ejercicios modulo 3-3.19

fun main(args: Array<String>) {
    val rollDice = { sides: Int ->
        if (sides == 0) 0
        else (1..sides).random()
    }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else (1..sides).random()
    }


}