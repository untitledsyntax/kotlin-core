fun main() {
    println("Write Your Name")
    println(greetName())
    println("Write Your Age")
    println(greetAge())
}
fun greetName(name: String = readln()) {
    println("My name is $name!")
}
fun greetAge(age: Int = readln().toInt()) {
    println("My age is $age")
}
fun main() {
    println("Write your name")
    val name = readln()
    println("Write your age")
    val age = readln().toInt()
    println(greetName(name))
    println(greetAge(age))
}

fun greetName(name: String) {
    println("My name is $name")
}

fun greetAge(age: Int) {
    println("My age is $age")
}

fun main() {
    var result = sum(5, b = 60)
    println(result)
}
fun sum(a: Int, b: Int): Int {
    return a + b
}


















































