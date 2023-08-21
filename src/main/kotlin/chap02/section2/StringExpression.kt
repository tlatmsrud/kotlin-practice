package chap02.section2

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */
typealias Username = String

fun main() {
    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}"

    println("str1: $str1 , str2 : $str2")

    val formattedString = """
        안녕하세요
        안녕해요
    """

    println(formattedString)

    val user : Username = "Kildong"
}

