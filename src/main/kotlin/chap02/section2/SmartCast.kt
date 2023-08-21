package chap02.section2

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    val x : Any

    x = "Hello" // 아직 x의 자료형은 Any

    if(x is String){ // String으로 Smart Casting
        println(x.length)
    }

}