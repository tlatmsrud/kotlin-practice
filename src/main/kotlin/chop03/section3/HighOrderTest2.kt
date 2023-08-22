package chop03.section3

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main(){
    val result = highOrder({x, y -> x*y}, 10, 20)
    println(result)
}

fun highOrder(sum: (Int, Int) -> Int, a : Int, b: Int) : Int{
    return sum(a,b)
}