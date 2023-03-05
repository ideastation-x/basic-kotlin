fun main() {
    // Format 1
    var text: String? = "Name"
    text = null
    if (text != null) {
        println(text.length)
    } else {
        println("The variable is null.")
    }

    // Format 2
    // text2!! this syntax will throw NullPointerException
    // text2? this syntax will display null
    val text2: String? = null
//    println(text2!!.length)
    println(text2?.length)

    // Format 3
    val text3 = text ?: "Some text."
    println(text3)
}