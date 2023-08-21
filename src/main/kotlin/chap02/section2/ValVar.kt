package chap02.section2

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    val number = 10
    var language = "Korean"
    val language2 = "English"
    val secondNumber: Int = 20
    language = "English"

    println("number : $number")
    println("language : $language")
    println("secondNumber : $secondNumber")
    println("language1 === language2 : ${language === language2}")
}