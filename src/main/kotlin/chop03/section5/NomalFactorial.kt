package chop03.section5

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main(){
    val number = 4
    val result: Long

    result = factorial(number)
    println("Factorial : $number -> $result")
}
fun factorial(n : Int) : Long{
    return if(n == 1) n.toLong() else n * factorial(n-1)
}