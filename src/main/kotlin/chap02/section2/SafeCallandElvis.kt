package chap02.section2

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    var str1 :String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1, length : ${str1?.length?:-1}")

}