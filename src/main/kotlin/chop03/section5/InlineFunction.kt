package chop03.section5

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    shortFunc(3){println("first call : $it")}
    shortFunc(5){println("Second call : $it")}
}
inline fun shortFunc(a : Int, out : (Int) -> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}