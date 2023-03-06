fun main() {
    println(getMax(3,4))
    println(getMax2(4,5))
}

// Format 1
fun getMax(a: Int, b: Int, ): Int {
    return if (a > b) a else b
}

// Format 2
fun getMax2(a: Int, b: Int, ) = if (a > b) a else b
