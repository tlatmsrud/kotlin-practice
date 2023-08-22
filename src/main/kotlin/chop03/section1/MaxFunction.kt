package chop03.section1

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun max(a : Int, b : Int) : Int = if(a>b) a else b

fun main(){
    val num1 = 10
    var num2 = 3

    val result: Int = max(num1, num2)
    println(result)
}