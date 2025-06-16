package turorial

import kotlin.math.sqrt

/**
 * By defaults, every property of a class is public (can be accessed through instance in any file).
 * But we can modify their visibility by "private" or "protected"
 *  - private : can only be accessed inside their declared classes
 *  - protected : can only be accessed inside their declared classes and subclasses
 * */
fun main(){
    val tri = Triangle(3.0,6.0, 7.0)
//    println(tri.p) cannot access
    println("This triangle have perimeter of ${tri.getP() * 2}")

    val squareTriangle = SquareTriangle(3.0, 4.0)
    println("square triangle have a hypotenuse of ${squareTriangle.getHypotenuse()}")
    println("square triangle have an area of ${squareTriangle.area}")
}

open class Triangle(var corner1 : Double, var corner2 : Double, var corner3 : Double){
    private val p = (corner1  + corner2 + corner3) / 2
    protected open val area = sqrt(p * (p - corner1) * (p - corner2) * (p - corner3))

    /**
     * Make a public method to return P (half perimeter)
     * */
    fun getP() : Double{
        return p
    }
}

class SquareTriangle(
    sqCorner1: Double,
    sqCorner2: Double
) : Triangle(
    corner1 = sqCorner1,
    corner2 = sqCorner2,
    corner3 = (sqrt(sqCorner1 * sqCorner1 + sqCorner2 * sqCorner2))
){

    /**
     * Hypotenuse of a square triangle
     */
    private val hypotenuse : Double = corner3

    /**
     * Make a public method to return Hypotenuse
     * */
    fun getHypotenuse() : Double{
        return hypotenuse
    }

    /**
     *   Override visibility of the property
     */
    public override val area  : Double = sqCorner1 * sqCorner2 / 2
}