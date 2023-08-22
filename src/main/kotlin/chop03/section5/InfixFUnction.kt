package chop03.section5

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    val multi = 3 multiply 10
    println("multi : $multi")
}

infix fun Int.multiply(x: Int) : Int{
    return this * x
}