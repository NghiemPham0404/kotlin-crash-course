package turorial

fun main(){
    // TODO  : WHILE LOOP. Example : use WHILE loop to count from 1 to n
//    print("Input number need to count : >")
//    val n = readln().toIntOrNull()?:1
//    var i = 0
//    while(i < n){
//        println(i+1)
//        i++
//    }

    // TODO  : FOR LOOP. Example : use FOR loop to calculate sum of an array
    val numbs = intArrayOf(3,4,1,6,9)
    var sum = 0
    for(i in 0 until numbs.size){ // TODO : '0 until numbs.size' equal to '0 .. numbs.size-1'
        sum += numbs[i]
    }
    println("sum of the array is : $sum")

    sum = 0
    for(num in numbs){      // TODO : still using FOR loop, using value instead using index (safer way)
        sum += num
    }
    println("sum of the array 2 : $sum")

    println("-------------------------------------------------------------------------------------------------------")

    // TODO : you can use for loop to print every character of a string or access to a character of a string
    val s = "KOTLIN IS GREAT"
    for (c in s){
        println(c)
    }
    println("-------------------------------------------------------------------------------------------------------")

    var finalString = buildString{
        for (i in s.lastIndex downTo 0){
            append(s[i])
        }
    }
    println(finalString)


}