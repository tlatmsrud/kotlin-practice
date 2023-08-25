package chap04.section2

/**
 * title        :
 * author       : sim
 * date         : 2023-08-25
 * description  :
 */

fun main() {

    print("Enter the lines : ")
    val n = readln()!!.toInt() // 한정 기호 !!

    for(line in 1..n){
        for(space in 1 .. n-line) print(" ")
        for(star in 1 until 2*line) print("*")
        println("")
    }
}