package chop03.section2

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main(){
    println(highFunction({x,y -> x+y}, 10, 20))
}
fun highFunction(sum : (Int, Int)->Int, a : Int, b : Int) : Int = sum(a,b)