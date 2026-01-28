// Here we are using if statemet for if it's raining take umbrella and else No need to take umbrella

fun main() {
    println("IS Raining?")
    val userInput = readLine()
    if (userInput == "yes" || userInput == "Yes") {
        println("Take Umbrella & Take Care of Yourself")
    }else{
        println("No Need to take Umbrella Enjoy your Day!")
    }
}

// Here we are using when statement by assigning name with some string 

fun main() {
    val animal = readln()
    when (animal) {
        "Dog" -> println("Animal is Dog")
        "Horse" -> println("Animal is Horse")
        "Rhino" -> println("Animal is Rhino")
        "Cat" -> println("Animal is Cat")
        "Lion" -> println("Animal is Lion")
        else -> println("No Animal Found in Database")
    }
}