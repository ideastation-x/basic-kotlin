fun main() {
    sum(5,6,7,10)
}

fun sum(vararg numbers: Int) {
    numbers.forEach { println(it) }
}