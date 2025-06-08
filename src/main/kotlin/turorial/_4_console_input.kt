package turorial

fun main(){
    // TODO  : readln() is the function receive a input string
    print("your command is :")
    var input = readln()
    println("you have just entered $input")

    print("enter your number : ")
    var numberInput = readln()
    var number = numberInput.toInt()
    println("is this number even ? ${number % 2 == 0}")

    print("enter your number : ")
    var numberInput2 = readln()
    var number2 = numberInput2.toIntOrNull()
    println("your input number is : $number2")

    // TODO : use "!!" to by pass the null warning (not recommend)
    val isNumber2Even = number2!! % 2 == 0
    print("number is even ? $isNumber2Even")

    // TODO : use default value to make sure number is not null
    var number2V2 = numberInput2.toIntOrNull() ?: 0
    val isNumber2EvenV2 = number2V2 % 2 == 0
    print("number is even ? $isNumber2EvenV2")
}