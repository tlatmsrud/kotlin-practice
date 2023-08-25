package chap04.section2

/**
 * title        :
 * author       : sim
 * date         : 2023-08-25
 * description  :
 */

fun main() {

}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a,b)
}

fun retFunc(){
    println("start of reFunc")
    inlineLambda(13, 3){a,b ->
        val result = a+b
        if(result > 10) return
        println("result : $result")
    }
}