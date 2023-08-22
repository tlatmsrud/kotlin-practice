package chop03.section5

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */
fun main(){
    shortFuncs(3) {println("First call $it") }
}

inline fun shortFuncs(a: Int, noinline out: (Int) -> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}