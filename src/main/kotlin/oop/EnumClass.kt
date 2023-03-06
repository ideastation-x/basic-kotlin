package oop

fun main() {
//    for(direction in Direction.values()) {
//        println(direction.distance)
//    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40)
}