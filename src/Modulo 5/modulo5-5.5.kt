// ejercicio modulo 5-5.5

fun main() {
    val allBooks = setOf("Hamlet", "Macbeth", "Othello", "Romeo and Juliet")
    val library = mapOf("William Shakespeare" to allBooks)

    val hasHamlet = library.values.any { it.contains("Hamlet") }
    println("Does the library have Hamlet? $hasHamlet")

    val moreBooks = mutableMapOf("Miguel de Cervantes" to "Don Quixote")
    moreBooks.getOrPut("Gabriel Garcoa Marquez") { "Cien años de soledad" }

    moreBooks.getOrPut("Miguel de Cervantes") { "Novelas Ejemplares" }

    println("\nMore books map:")
    println(moreBooks)
}