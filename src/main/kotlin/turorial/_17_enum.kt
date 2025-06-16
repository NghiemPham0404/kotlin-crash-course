package turorial
/**
 * Enum is a set of constant values,
 * used in variable that can only receive predefine values
 * */
fun main(){
    // TODO : print values of an enum
    // println(Country.GERMANY)
    Country.entries.forEach { println(it) }

    // TODO : print ordinal values of an enum
    // println(Country.GERMANY.ordinal)
    Country.entries.forEach { println(it.ordinal) }

    // TODO : use when to map values of an enum
    // println(greet(Country.GERMANY))
    Country.entries.forEach { println(greet(it))}

    println("------------------------------------------------------")
    // TODO : print enum value's property of an enum class
    // println(CountryCode.GERMANY.code)
    CountryCode.entries.forEach { println(it.code) }
}

// TODO : Standard Enumeration
enum class Country{
    GERMANY, FRANCE, USA
}

// TODO : Enum Class in Kotlin, allow us to extend values of enum value
enum class CountryCode(val code : String){
    GERMANY("DE"), FRANCE("FR"), USA("US")
}

fun greet(country : Country):String{
    return when(country){
        Country.GERMANY -> "Guten Tag!"
        Country.FRANCE -> "Bonjour!"
        Country.USA -> "Hello!"
    }
}