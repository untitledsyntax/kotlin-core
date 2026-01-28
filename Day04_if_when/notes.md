if/when 

In Kotlin, both if and when are powerful control flow constructs used for decision-making and can function as both statements and expressions (returning a value).

IF:-
Use if for simple, binary (two-option) conditional logic or basic true/false checks. 
ex:-
val time = 20

if (time < 18) {
    println("Good day.")
} else {
    println("Good evening.") // Output: Good evening.
}
You can also use else if for sequential checks

When:-
The when construct evaluates its argument against all branches sequentially and executes the code for the first match. 
ex:-
val day = 4

when (day) {
    1 -> println("Monday")
    2 -> println("Tuesday")
    3 -> println("Wednesday")
    4 -> println("Thursday") // This branch matches, so it executes.
    5 -> println("Friday")
    else -> println("Weekend") // `else` is the 'catch-all' branch
}
