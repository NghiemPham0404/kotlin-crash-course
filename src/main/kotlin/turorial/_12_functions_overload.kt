package turorial

fun main(){
    val str1 = "LIVE"
    println("reserve of '$str1' is : ${reversed(str1)}")

    val number = 1234
    println("reserve of $number is : ${reversed(number)}")
}
/**
 * OVERLOAD mean you can have different function with the same name, same feature
 * but different in input parameters and output return
 * */
fun reversed(string : String) : String{
    val finalString = buildString {
        for(i in string.lastIndex downTo 0){
            append(string[i]);
        }
    }
    return finalString
}

fun reversed(number : Int) : Int{
    return reversed(number.toString()).toInt()
}