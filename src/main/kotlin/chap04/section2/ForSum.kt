package chap04.section2

/**
 * title        :
 * author       : sim
 * date         : 2023-08-25
 * description  :
 */

fun main() {
    var sum = 0

    for (x in 1..5) sum+=x

    println("sum = $sum")

    for (x in 5 downTo 1) println(x)

    for (x in 1..5 step 2) println(x)
}