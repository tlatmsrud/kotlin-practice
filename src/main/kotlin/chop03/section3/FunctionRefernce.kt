package chop03.section3

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    val res1 = funcParam(3,2, ::sum)
    println(res1)

    hello(::text)

    val likeLambda = ::sum
    println(likeLambda(6,6))
}

fun text(a: String, b: String) = "HI! $a $b"

fun funcParam(a : Int, b : Int, c : (Int, Int) -> Int): Int{
    return c(a,b)
}

fun hello(body: (String, String) -> String) : Unit {
    println(body("Hello","World"))
}