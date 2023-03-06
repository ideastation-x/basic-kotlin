package oop

fun main() {
    val user1 = LazyUser("Alex", "Dobbin", 23)
    val user2 by lazy {
        LazyUser("User1", "LastName", 0)
    }

    println(user2.firstName)
}

class LazyUser(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User: $firstName was created")
    }
}