package turorial

fun main(){

    // TODO : Array of integer numbers
    var favoriteNumbers = intArrayOf(3,2,1,4,6,3)

    // TODO : Access array by index ( 0 <= ... <=  arrayLength-1)
    val index = 3
    val len = favoriteNumbers.size
    if (index in 0..len)
        println(favoriteNumbers[index])
    else
        println("invalid index")

    // TODO : Access array by index (with Null safety)
    println(favoriteNumbers.getOrNull(6))
    println(favoriteNumbers.getOrElse(6,  {5}))

    // TODO : iterate array
    favoriteNumbers.forEach { number -> print(" $number") }

    // TODO : short way to print the whole array
    println("\narray :  ${favoriteNumbers.contentToString()}")

    // TODO : add number into array
    favoriteNumbers += 4
    println("")
    favoriteNumbers.forEach { number -> print(" $number") }

    // TODO : NOTE**  : Kotlin cannot directly remove item from array

    println("\n---------------------------------------------------------------------------------------------------")

    // TODO : Use MutableList instead of array
    var favNums = mutableListOf<Int>(3,2,1,4,6,3)

    // TODO : iterate through a list
    favNums.forEach { num -> print(" $num") }

    // TODO : add to list
    favNums.add(134)

    // TODO : remove item from list
    favNums.remove(3) // remove first item match the given value
    println("")
    println("array : $favNums")
}