package turorial
/**
 * Interface IN KOTLIN is a contract of classes, a set of methods and properties
 * When a class implements an interface, it has to have interface's properties and methods
 * */
fun main(){
    val rect1 = Rectangle2(width = 3, height = 4)
    val circle1 = Circle2(radius = 3)
    val shapes = listOf(rect1, circle1)
    shapes.forEachIndexed { index, shape ->
        println("shape $index have area: ${shape.area} perimeter: ${shape.perimeter}")
    }
}

// TODO : Create Shape as an interface for Circle and Rectangle class
//  Remember to override (re-declare) the properties declared in Shape
interface Shape{
    val area : Double
    val perimeter : Double
}

// TODO : Create Circle class implements Shape interface
data class Circle2(val radius : Int):Shape {
    val diameter = radius * 2

    override val area = radius * radius * Math.PI   // override area

    override val perimeter = 2 * diameter * Math.PI // override perimeter
}

// TODO : Create Rectangle class implements Shape interface
data class Rectangle2(val width : Int, val height : Int):Shape{

    override val area = (width * height).toDouble() // override area

    override val perimeter = 2.0 * (width + height) // override perimeter
}