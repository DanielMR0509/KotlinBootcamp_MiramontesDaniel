fun main() {
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }

    gamePlay(rollDice2)
}

fun gamePlay(diceRoll: (Int) -> Int) {
    val sides = 6
    val result = diceRoll(sides)
    println("The dice roll result for $sides sides is: $result")
}