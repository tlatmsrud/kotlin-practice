package chap04.section3

/**
 * title        :
 * author       : sim
 * date         : 2023-08-25
 * description  :
 */

fun main() {
    val a = 6
    val b = 0
    val c : Int

    try{
        c = a/b
    }catch (e : Exception){
        println("Exception is handled.")
    }finally {
        println("항상종료")
    }
}