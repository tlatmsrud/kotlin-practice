package chap04.section1

/**
 * title        :
 * author       : sim
 * date         : 2023-08-25
 * description  :
 */

fun main() {
    val a = 12
    val b = 7

    val max = if (a>b){
        println("a 선택")
        a
    }
    else{
        println("b 선택")
        b
    }

    println(max)
}