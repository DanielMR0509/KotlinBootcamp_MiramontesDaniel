// ejercicio modulo 6-6.8

import kotlin.math.absoluteValue

enum class Directions { NORTH, SOUTH, EAST, WEST, START, END }

class GameMap(val width: Int = 4, val height: Int = 4) {
    val grid = Array(width) { arrayOfNulls<String>(height) }

    init {
        for (i in 0 until width) {
            for (j in 0 until height) {
                grid[i][j] = "Location ($i, $j): A mysterious part of the forest."
            }
        }

        grid[0][0] = "The starting clearing. It's peaceful here."
        grid[1][1] = "A dark cave. You hear water dripping."
        grid[2][2] = "A high cliff with a view of the ocean."
        grid[3][3] = "An ancient ruin covered in vines."
    }

    fun getDescription(x: Int, y: Int): String {
        return grid[x][y] ?: "Nothing but void."
    }
}

class Game {
    private val gameMap = GameMap()
    private var x = 0
    private var y = 0
    var path = mutableListOf(Directions.START)

    val north = { y = (y + 1).rem(gameMap.height).absoluteValue; updateLocation(Directions.NORTH) }
    val south = { y = (y - 1).rem(gameMap.height + gameMap.height).rem(gameMap.height).absoluteValue; updateLocation(Directions.SOUTH) }
    val east = { x = (x + 1).rem(gameMap.width).absoluteValue; updateLocation(Directions.EAST) }
    val west = { x = (x - 1).rem(gameMap.width + gameMap.width).rem(gameMap.width).absoluteValue; updateLocation(Directions.WEST) }

    val end = {
        path.add(Directions.END)
        println("Game Over. Final path: $path")
        path.clear()
        false
    }

    private fun updateLocation(dir: Directions) {
        path.add(dir)
        println("You moved ${dir.name}.")
        println(gameMap.getDescription(x, y))
    }

    fun move(action: () -> Any) = action()

    fun makeMove(command: String?) {
        when (command?.trim()?.lowercase()) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main() {
    val game = Game()
    println("Welcome! You are at (0,0).")

    while (true) {
        print("\nEnter direction (n/s/e/w): ")
        game.makeMove(readLine())
        if (game.path.isEmpty()) break
    }
}