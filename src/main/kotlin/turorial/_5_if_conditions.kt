package turorial

/**
Note : Kotlin always make sure the variable have the valid value (not null, we can by pass by using if to check if the
value is not null
 */
fun main() {

    print("enter your number : ")
    val input = readln()
    val inputAsInt = input.toIntOrNull()

    // TODO : Regular if statement
    if (inputAsInt != null) {
        val isEven = inputAsInt % 2 == 0
        if (isEven) {
            println("the number is even")
        } else {
            println("the number is odd")
        }
    } else {
        println("please enter the valid number!")
    }

    // TODO : assignment if statement
    if (inputAsInt != null) {
        val s = if(inputAsInt % 2 == 0) "the number is even" else "the number is odd"
        println(s)
    }
}