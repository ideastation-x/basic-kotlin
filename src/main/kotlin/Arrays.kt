fun main() {
    val names = arrayOf("John", "Stephen", "Megan")
    val numbers = arrayOf(1,2,3,4,5, "Alex")
    names[0] = "Jack"
    println(names[0])
    println(names.size)

    for(number in numbers) {
        if(number is Int)
            println(number)
    }
}