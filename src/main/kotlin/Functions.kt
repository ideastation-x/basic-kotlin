fun main() {
    sayHello("Alex", 22)
    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("Some data")
    } else {
        showMessage()
    }
}

fun sayHello(name: String, age: Int) {
    println("Hello, $name! Your age is $age")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("There's no internet connection")
}

