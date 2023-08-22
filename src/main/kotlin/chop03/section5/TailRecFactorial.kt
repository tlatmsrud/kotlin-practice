package chop03.section5

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main(){
    val number = 5
    println("Factorial : $number -> ${factorial(number)}")

    oneParam {"hi "}
}

tailrec fun factorial(n: Int, run: Int = 1): Long{
    return if(n==1) run.toLong() else factorial(n-1, run*n)
}

fun oneParam(out:() -> String){

}