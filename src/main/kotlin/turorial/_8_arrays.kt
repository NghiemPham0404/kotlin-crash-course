package turorial

fun main(){

    // TODO : Array of integer numbers
    val favoriteNumbers = intArrayOf(3,2,1,4,6,3)

    // TODO : Access array by index ( 0 >= ... >=  arrayLength-1)
    val index = 3
    val len = favoriteNumbers.size
    if (index in 0..len)
        println(favoriteNumbers[index])
    else
        println("invalid index")

    // TODO : iterate array
    favoriteNumbers.forEach { number -> print(" $number") }

}