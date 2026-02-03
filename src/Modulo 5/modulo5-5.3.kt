// ejercicio modulo 5-5.3

class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAuthor(): Pair<String, String> {
        return title to author
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main() {
    val myBook = Book("The Kotlin Way", "Kotlin Master", 2024)

    val (title, author, year) = myBook.getTitleAuthorYear()
    println("Here is your book $title written by $author in $year.")

    val (justTitle, justAuthor) = myBook.getTitleAuthor()
    println("Brief info: $justTitle by $justAuthor")
}