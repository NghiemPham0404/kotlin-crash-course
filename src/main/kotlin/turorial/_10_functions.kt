package turorial

/**
 * there are different type of functions in Kotlin:
 * - regular function
 * - extension functions
 * - lambda functions
 */
fun main(){
    val input1 = "LIVE"
    val input2 = "RACECAR"

    println("reverse string of '$input1' is '${reverse(input1)}'")

    println("reverse string of '$input2' is '${reverse(input2)}'")
    println("is '$input2' a palindrome : ${isPalindrome(input2)}")

    printMyName()

    printMyName(name = "Dessert Eagle")
}

// TODO : REGULAR FUNCTION
// TODO : return a reversed string of a string
fun reverse(stringToReverse : String) : String {
    var reversedString = buildString{
        for (i in stringToReverse.lastIndex downTo 0){
            append(stringToReverse[i])
        }
    }
    return reversedString
}

// TODO : check if a string palindrome
fun isPalindrome(s : String) : Boolean{
    return s == reverse(s)
}

// TODO : set default value for function
fun printMyName(name : String = "Nghiem"){
    println("your name is $name")
}
