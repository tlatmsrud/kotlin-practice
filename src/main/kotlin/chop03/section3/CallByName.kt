package chop03.section3

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    val result = callByName(otherLambda)
    println(result)
}
fun callByName(b: () -> Boolean) : Boolean{
    println("callByName")
    return b()
}

val otherLambda : () -> Boolean = {
    println("otherLambda")
    true
}