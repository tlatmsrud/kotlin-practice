package chop03.section5

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    shortFunc3(3){
        println("First call : $it")
    }
}

inline fun shortFunc3(a: Int, crossinline out: (Int) -> Unit){
    println("Before calling out")
    nestedFunc {out(a)}
    println("After calling out")
}

fun nestedFunc(body : () -> Unit){
    body()
}