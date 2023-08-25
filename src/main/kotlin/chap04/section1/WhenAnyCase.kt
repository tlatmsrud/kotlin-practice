package chap04.section1

/**
 * title        :
 * author       : sim
 * date         : 2023-08-25
 * description  :
 */

fun main() {

    cases("Hello")
    cases(1)

}

fun cases(obj : Any){
    when(obj){
        1 ->println("Int : $obj")
        "Hello" -> println("String : $obj")
        is Long -> println("Long : $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}