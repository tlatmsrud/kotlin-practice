package chap02.section2

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    val a : Int = 20
    val b = a

    println(a === b)

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println( c == d )
    println(c === d )
    println(c === e)
}