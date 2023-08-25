package chap04.section2

/**
 * title        :
 * author       : sim
 * date         : 2023-08-25
 * description  :
 */

fun main() {
    println("Entier Number : ")
    var number = readln()!!.toInt() //한정기호
    var factorial = 1

    while(number > 0){
        factorial *= number
        number--
    }

    println("Factorial : $factorial")
}