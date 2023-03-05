fun main() {
    var x = 5
    val y = 3.0
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")
    var result = x + y
    result += 2
    println("result = $result")

    x = 0
    println("${x++}")
    println("${++x}")

    val isActive = false
    if (isActive) {
        println("The user is active")
    } else {
        println("The user is not active")
    }
}