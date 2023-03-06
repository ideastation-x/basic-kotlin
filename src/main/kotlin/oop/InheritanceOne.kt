package oop

fun main() {
    val car = ThisCar("BMW", "RED", 1, 4)
    val plane = Plane("Boeing", "White", 2, 50)

    plane.move()
    plane.stop()
}

open class Vehicle(val name: String, val color: String) {
    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name has stopped")
    }
}

class ThisCar(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {

}

class Plane(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
    override fun move() {
        flying()
        super.move()
    }

    private fun flying() {
        println("The plane is flying")
    }
}
