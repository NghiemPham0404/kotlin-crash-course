package turorial

/**
 * Lambda function is a function that you can pass to other function
 * signature () -> {}
 * for most case, we only need implement the code inside '{}'
 */

fun main(){
    val str1 = "Hi Mr.Robinson 24 Brooklyn St"
    val numbers = intArrayOf(32,123,44,53,11)

    // TODO : use lambda function to print an array  format : () - {}
    numbers.forEach { n -> print("$n ")}

    // TODO : use lambda function to filter letters from a string (only implement inside {})
    //          , use "it" as a character in string
    val letterOnly = str1.filter{
        it.isLetter()
    }
    println("\n$letterOnly")

    // TODO : use lambda function to filter even numbers from numbers array
    val evenNumbers = numbers.filter {
        it % 2 == 0
    }
    println(evenNumbers)

    println("----------------------------------------------------------------")

    // TODO : declare lambda function as a variable then pass it into another function
    val onlyEvenNumber: (Int) -> Boolean = {
        it % 2 == 0
    }
    println(myIntArrayFilter(numbers, onlyEvenNumber).contentToString())
}

// TODO : A function that can passed in a lambda function
fun myIntArrayFilter(array: IntArray, predicate : (Int) -> Boolean): IntArray{
    var newIntArray = intArrayOf()
    for(i in 0 until array.size){
        if (predicate(array[i])) {
            newIntArray += array[i]
        }
    }
    return newIntArray
}
