package chap02.section3

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    checkArg("Heelo")
    checkArg(12)
}

fun checkArg(x : Any){
    if (x is String){
        println("x is String")
    }

    if(x is Int){
        println("x is Int")
    }
}