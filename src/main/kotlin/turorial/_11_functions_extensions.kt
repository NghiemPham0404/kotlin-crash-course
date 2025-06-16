package turorial

fun main(){
    val input1 = "LIVE"

    println("reverse string of '$input1' is '${input1.reverse()}'")

    val number = 123

    println("reverse number of '$number' is ${number.reverse()}")
}
// TODO : EXTENSION FUNCTIONS
fun String.reverse():String{
    var reversedString = buildString{
        for (i in this@reverse.lastIndex downTo 0){
            append(this@reverse[i])
        }
    }
    return reversedString
}

fun Int.reverse():Int{
    return this.toString().reversed().toInt();
}