package turorial

/**
 * Singleton mean an instance of a class that can only created once in application.
 * Usage: when you want to create an instance that can be used widely in application runtime.
 * */
fun main(){
    val numbers = intArrayOf(3,1,5,2,4)
    println(MyCalculator.sum(*numbers))
    println(MyCalculator.multiple(*numbers))
}

object MyCalculator{

    // TODO : sum all number in a number array
    fun sum(vararg numbers : Int) : Int{
        var result = 0
        for(number in numbers){
            result += number
        }
        return result
    }

    // TODO : multiple all number in a number array
    fun multiple(vararg  numbers : Int) : Int{
        var result = 1
        for(number in numbers){
            result *= number
        }
        return result
    }
}