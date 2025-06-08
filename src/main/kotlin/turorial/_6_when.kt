package turorial

/**
 * when have the same concept of if conditions, but it can be
 * used to handle multiple conditions much easier
 * */
fun main(){
    print("enter your number : ")
    val input = readln()
    val inputAsInt = input.toIntOrNull()

    // TODO : use 'when' with no parenthesis
    if(inputAsInt!=null){
        val output = when {
            inputAsInt % 2 == 0 -> "the number is even"
            inputAsInt < 10 -> "the number is odd and less than 10"
            inputAsInt > 100 -> "the number is odd and atleast 101"
            else -> "the number is $inputAsInt"
        }
        println(output)
    }else{
        println("please enter valid number")
    }

    // TODO : use 'when' with parenthesis (only check equal)
    if(inputAsInt!=null){
        val output = when (inputAsInt){
            10 -> "the number 10"
            100 -> "the number is 101"
            in 10..100 -> "the number is between 10 and 100"
            else -> "the number is $inputAsInt"
        }
        println(output)
    }else{
        println("please enter valid number")
    }
}