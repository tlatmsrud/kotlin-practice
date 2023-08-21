package chap02.section2

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1 : $str1, length : ${str1?.length}")

    val len = if(str1 != null) str1.length else -1
    println("str1 : $str1 , length : $len")
}