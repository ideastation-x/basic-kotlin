package oop

fun main() {
    val user = User("Alex", "Jason", 23)
    val friend = User("Bob", "John", 21)
    val user2 = User(age = 19, firstname = "Alex", lastname = "P")

    user.favoriteMovie = "Interstellar"

    println(user.favoriteMovie)
}

//class User(var name: String, var lastname: String, var age: Int) {
//    constructor(name: String) : this(name, "LastName", 0)
//    constructor(name: String, lastname: String) : this(name, lastname, 21)
//}

//class User(firstname: String, var lastname: String = "Lastname", var age: Int) {
//    var firstname = firstname
//        get() = "Firstname: $field"
//        set(value){
//            println()
//            field = value
//        }
//}

class User(firstname: String, var lastname: String = "Lastname", var age: Int) {
    lateinit var favoriteMovie: String

}