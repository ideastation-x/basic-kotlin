package oop

fun main() {
    println(Calculator.sum(5,10))
    val max = Calculator.max
    println(max)
}

class Calculator {
    companion object {
        var max = 100
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}