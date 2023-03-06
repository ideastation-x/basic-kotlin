fun main() {
    sendMessages()
}

fun sendMessages(name: String = "User", message: String = "no message") {
    println("Name = $name and message = $message")
}