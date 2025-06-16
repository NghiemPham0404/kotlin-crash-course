package turorial

/**
 * Abstract class in Kotlin is the same concept of interface which contains properties and methods,
 * but we can't create instance from abstract class.
 * Abstract class can contain abstract properties and abstract methods
 * */


fun main(){
    val dog = Dog()
    val shark = Shark()

    println("Dog have ${dog.legs} legs")
    println("Dog live ${dog.livingAt}")

    println("Shark can swim is ${shark.canSwim}")
    println("Shark live ${shark.livingAt}")

    dog.count = 100
    shark.count = 10

    dog.printInfo()
    shark.printInfo()

    dog.eat()
    shark.eat()

    classify(dog)
    classify(shark)
}

// TODO : abstract class Animal
abstract class Animal(val livingAt : String){
    var count : Long = 0                // normal property

    abstract val name: String           // abstract property

    fun printInfo(){                    // normal method
        println("$name : {" +
                "   \n\tlivingAt : $livingAt," +
                "   \n\tcount : $count" +
                "\n}")
    }

    abstract fun eat()                  // abstract method
}

// TODO : create Dog class inherit the Animal class
class Dog: Animal(livingAt = "on land"){
    val legs = 4

    override val name = "Dog"

    override fun eat(){
        println("Dog eat bone")
    }
}

// TODO : create Shark class inherit the Animal class
class Shark : Animal(livingAt = "under water"){

    val canSwim = true

    override val name = "Shark"

    override fun eat() {
        println("Shark eat smaller fish")
    }

}

// TODO : interface that have function to classify animals
fun classify(animal: Animal) {
    when(animal) {
        is Dog -> println("this is a dog")
        is Shark -> println("this is a shark")
        else -> print("")
    }
}