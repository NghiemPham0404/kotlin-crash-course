fun main(){
    var x = 6
    var y = 9

    // TODO : regular calculations
    println(x + y)
    println(x - y)
    println(x * y)
    println(x / y)
    println(x % y)

    // TODO : assignment operators
    x = x + 1
    x += 1
    x++
    println(x)
    x = x - 1
    x -= 1
    x--
    println(x)

    // TODO : comparison operators
    println(x == y)
    println(x > y)
    println(x < y)
    println(x >= y)
    println(x <= y)

    // TODO : logical operators
    val areBothEven = x % 2 == 0 && y % 2 == 0
    val isOneOfBothEven = x % 2 == 0 || y % 2 == 0
    println("are both of them even : $areBothEven")
    println("is one of them even : $isOneOfBothEven")


}