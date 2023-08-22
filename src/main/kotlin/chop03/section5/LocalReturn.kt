package chop03.section5

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    shortFunc2(3){
        println("First call : $it")
        return
    }
}

inline fun shortFunc2(a: Int, out: (Int) -> Unit){
    println("Before calling Out")
    out(a)
    println("After calling Out")
}
