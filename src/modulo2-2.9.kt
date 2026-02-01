fun main() {
    // ejercicio 1 del modulo 2-2.9
    val trout = "trout"
    var haddock = "haddock"
    var snapper = "snapper"
    println("I like the $haddok and the $trout but i dont like $snapper.")

    // ejercicio 2
    when(fishName.length) {
        0 -> println("Error: name cant be empty")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}