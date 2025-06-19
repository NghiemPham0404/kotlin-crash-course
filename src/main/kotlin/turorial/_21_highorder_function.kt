package turorial

/**
 * In Kotlin, a high-order function is a function that takes another function as a parameter or returns a function.
 */

/**
 * calculate function is a function take another lambda function as operation
 * */
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

/**
 * High order function is also a function that returns another function
 */
fun operationGenerator(): (Int, Int) -> Int {
    return { a, b -> a * b }
}


fun main() {
    val a = 3
    val b = 5

    // TODO : pass function to high order function
    val sum = calculate(a, b) { a, b -> a + b }
    val subtract = calculate(a,b){a, b -> a - b}
    println(sum)
    println(subtract)

    // TODO : save function to a variable than call it with parameter
    val multiply = operationGenerator()
    println(multiply(4, 2))
}
