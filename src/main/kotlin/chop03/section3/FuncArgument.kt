package chop03.section3

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    val res1 = sum(3,2)
    val res2 = mul(sum(3,3), 3)
}

fun sum(a : Int, b: Int) = a + b
fun mul(a : Int, b: Int) = a * b