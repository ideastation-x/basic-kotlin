fun main() {
    val alarm = 7
    val text = when {
        alarm == 8 || alarm == 7 -> println("The time is $alarm")
        alarm <= 10 -> println("The number is in the range 1..10")
        else -> println("The time is $alarm")
    }

    val text2 = when (alarm) {
        in 1..10 -> println("this one is so cool !")
        else -> print("other methods that have to remember")
    }

    println(text)
}