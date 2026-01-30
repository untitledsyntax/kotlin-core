/*
FOR LOOP
- Used when range or collection is known
*/

fun main() {

    // for loop (1 to 5)
    for (i in 1..5) {
        println(i)
    }

    // for loop (1 to 4) - last number not included
    for (i in 1 until 5) {
        println(i)
    }

    // for loop with step
    for (i in 1..10 step 2) {
        println(i)
    }

    // reverse for loop
    for (i in 5 downTo 1) {
        println(i)
    }

    // for loop with array
    val numbers = arrayOf(10, 20, 30)
    for (num in numbers) {
        println(num)
    }

    /*
    WHILE LOOP
    - Condition checked before loop
    - Loop may not run at all
    */

    var x = 1
    while (x <= 5) {
        println(x)
        x++
    }

    /*
    DO-WHILE LOOP
    - Runs at least once
    - Condition checked after loop
    */

    var y = 1
    do {
        println(y)
        y++
    } while (y <= 5)

    /*
    BREAK & CONTINUE
    */

    // break stops the loop
    for (i in 1..5) {
        if (i == 3) break
        println(i)
    }

    // continue skips current iteration
    for (i in 1..5) {
        if (i == 3) continue
        println(i)
    }
}

/*
WHEN TO USE:
- for loop → range / list known
- while loop → unknown iterations
- do-while → must run once
*/
