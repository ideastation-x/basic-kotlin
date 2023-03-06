fun main() {
    val max = getMin(6.5, 9.6)
    println(max)
}

fun getMin(a: Int, b: Int) = if (a < b) a else b

fun getMin(a: Double, b: Double) = if (a < b) a else b