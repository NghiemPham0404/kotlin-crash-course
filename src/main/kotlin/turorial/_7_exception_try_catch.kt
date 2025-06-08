package turorial

/**
 * Exception will break your code and make your application crash
 * Inorder to prevent that, use try catch to handle exception
 */
fun main(){
    print("enter your number : ")
    val input = readln()

    // TODO : Handle Exception
    val inputAsInt = try{
        input.toInt()
    }catch (e : NumberFormatException){
        0
    }

    val output = when {
        inputAsInt % 2 == 0 -> "the number is even"
        inputAsInt < 10 -> "the number is odd and less than 10"
        inputAsInt > 100 -> "the number is odd and atleast 101"
        else -> "the number is $inputAsInt"
    }
    println(output)

    // TODO : Throw Exception by ourself
    throw Exception("Here is an exception")
}