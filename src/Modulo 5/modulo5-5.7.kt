// ejercicio modulo 5-5.7

const val MAX_BOOKS_BORROWED = 5

object Constants {
    const val BASE_URL = "https://library.catalog.com/"
}

class Book(val title: String, val author: String) {

    companion object {
        const val BASE_EXTENSION = ".html"
    }

    fun canBorrow(currentBorrowedCount: Int): Boolean {
        return currentBorrowedCount < MAX_BOOKS_BORROWED
    }

    fun printUrl() {
        val url = Constants.BASE_URL + title.replace(" ", "_") + BASE_EXTENSION
        println("The book URL is: $url")
    }
}

fun main() {
    val myBook = Book("Kotlin Programming", "JetBrains")

    println("Can I borrow? ${myBook.canBorrow(3)}")
    println("Can I borrow? ${myBook.canBorrow(5)}")

    myBook.printUrl()
}