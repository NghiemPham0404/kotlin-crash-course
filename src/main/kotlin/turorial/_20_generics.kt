package turorial

/**
 * Generic in Kotlin is a feature that allows you to write general code
 * for different kinds of data types
 */
/**
 * Create our own generic codes with <...>
 * - <T>: Type
 * - <E>: Element (in Collection)
 * - <K, V>: Key, Value (in Map)
 */
fun main(){
    /**
     * as you can see, the filter method works both with a String and an array of int
     */
    val favoriteNumbers = intArrayOf(3, 2, 1, 42)
    val helloWorld = "Hello world!"

    val evenNumbers = favoriteNumbers.filter{it % 2 == 0}
    println("All even numbers : $evenNumbers")

    val lettersOnly = helloWorld.filter{it.isLetter()}
    println("All letters : $lettersOnly")

    val favoriteNumbers2 = listOf(3, 2, 1, 23, 44, 45)
    val oddNumbers = favoriteNumbers2.myFilter { it % 2 != 0}
    println("All odd numbers : $oddNumbers")

    val names = listOf(
        "Ana",
        "Alisa",
        "Bob",
        "Berry"
    )
    val startWith = "A"
    val filteredName = names.myFilter { it.startsWith(startWith, true) }
    println("All name : $filteredName")
}

// TODO : create our own filter with generic
fun <T> List<T>.myFilter(predicate : (T) -> Boolean):List<T>{
    var results = mutableListOf<T>()
    for (item in this){
        if(predicate(item)){
            results.add(item)
        }
    }
    return results
}

// TODO : use generic in a class
class Box<T>(val content: T) {
    fun get(): T = content
}

val intBox = Box(123)       // Box<Int>
val stringBox = Box("Hi")   // Box<String>


/**  Sealed class is a class that can only be inherited in a file.
 *   Usage: when you know all the subclass in compile time.
 *   Example: Result receives (D)ata, if data validated return data, else return (E)rror
 *   Use generic to create Result
 */
sealed class Result<out D, out E>{
    data class Success<D>(val data:D): Result<D, Nothing>()
    data class Failure<E>(val error:E): Result<Nothing, E>()
}

fun makeNetworkCall(success: Boolean): Result<Int, String>{
    return if (success) Result.Success(23) else Result.Failure("Fail")
}