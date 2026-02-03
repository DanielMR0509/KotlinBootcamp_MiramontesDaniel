// ejercicio modulo 5-5.9

class Book(val title: String, var pages: Int)

fun Book.getWeight(): Double = pages * 1.5

fun Book.tornPages(torn: Int) {
    if (pages >= torn) pages -= torn else pages = 0
}

class Puppy {
    fun playWithBook(book: Book) {
        val torn = (1..50).random()
        book.tornPages(torn)
        println("The puppy played with '${book.title}'. Remaining pages: ${book.pages}")
    }
}

fun main() {
    val myBook = Book("Kotlin for Beginners", 250)
    val myPuppy = Puppy()

    println("Starting weight: ${myBook.getWeight()} grams")

    while (myBook.pages > 0) {
        myPuppy.playWithBook(myBook)
    }

    println("\nFinal weight: ${myBook.getWeight()} grams. The book is gone!")
}