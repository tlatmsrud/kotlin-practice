package chop03.section3

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    noParam { "hello" }
    oneParam{"Hello World! $it"}
    moreParam { a, b -> "Hello Word! $a $b" }
    withArgs("Arg1", "Arg2") { a, b -> "Hello $a $b" }
}

fun noParam(out : ( ) -> String) = println(out())
fun oneParam(out : (a : String) -> String) = println(out("OneParam"))
fun moreParam(out :(String, String) -> String){
    println(out("OneParam","TwoParam"))
}
fun withArgs(a: String, b:String, out: (String, String) -> String){
    println(out(a,b))
}