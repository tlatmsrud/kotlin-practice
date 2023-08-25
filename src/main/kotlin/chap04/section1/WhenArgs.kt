package chap04.section1

/**
 * title        :
 * author       : sim
 * date         : 2023-08-25
 * description  :
 */

fun main() {

    println("Enter the score : ")
    val score = readln().toDouble()
    var grade = 'F'

    when(score){
        in 90.0 .. 100.0 -> grade = 'A'
        in 80.0 .. 89.9 -> grade = 'B'
        in 70.0 .. 79.9 -> grade = 'C'
        !in 70.0 .. 100.0 -> grade = 'F'
    }

    println("Score : $score, Grade : $grade")
}