// ejercicio modulo 6-6.3

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf<Directions>(Directions.START)
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }

    val end: () -> Boolean = {
        path.add(Directions.END)
        println("Game Over")
        println("Path taken: $path")
        path.clear()
        false
    }
}

fun main() {
    val game = Game()
    println("Starting path: ${game.path}")

    game.north()
    game.east()
    game.south()
    game.west()

    game.end()

    println("Path after end: ${game.path}")
}