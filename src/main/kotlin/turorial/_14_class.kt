package turorial

import kotlin.math.sqrt
/**
 * Class is a block of code that can have properties and methods
 * We can create different instances of a class to use in different circumstances
 * Only use classes if you know that they can be reused in different files of projects
 * */
fun main(){
    // TODO : create instance of a class
    val rect1 = Rectangle(
        width = 5,
        height = 7
    )

    val rect2 = Rectangle(
        width = 5,
        height = 7
    )

    println(rect1.width)
    println(rect1.height)
    println("the diagonal of this rect is ${rect1.diagonal}")
    println("the area of this rect is ${rect1.area}")

    println("the area of this rect is ${rect1.area()}")

    println("is rect1 and rect2 the same : ${rect1.equals(rect2)}")

    println("---------------------------------------------------------------------")

    // TODO : Data class objects compare each other by their properties automatically
    val circle1 = Circle(3)
    val circle2 = Circle(3)
    println(circle1 == circle2) // = True

    // TODO : Data class also have default toString() would print its initial properties
    //  as the way that human would understand
    println(circle1)

    // TODO : Data class also allow to clone other instance by using copy method
    val circle3 = circle2.copy()

    // TODO : we can also changed properties in copy() function as well
    val circle4 = circle3.copy(radius = 6)
    println("perimeter of circle 4 is ${circle4.perimeter}")
    println("area of circle 4 is ${circle4.area}")
}

// TODO : Normal class contains properties and methods
class Rectangle(val width : Int, val height : Int){

    // TODO :  properties of class
    val diagonal = sqrt((width * width + height * height).toDouble())

    val area = width * height

    // TODO : methods of class
    fun area():Double{
        return width * height * 1.0
    }

    // TODO : Default, 2 instances of a class are compared by their memory address
    //  We write equals() method to compare 2 instances
    fun equals(other : Rectangle): Boolean{
        return (this.width == other.width) && (this.height == other.height)
    }
}

// TODO : Data class should only contains properties as its data
//  (as a class it can have methods as well but not recommended)
data class Circle(val radius : Int){
    val diameter = radius * 2

    val perimeter = 2 * diameter * Math.PI

    val area = radius * radius * Math.PI
}