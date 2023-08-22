package chop03.section1

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main(){
    namedParam(x = 10, y = 10, z = 10)
    namedParam(z = 200)
}

fun namedParam(x : Int = 200, y : Int = 200, z : Int) = println(x+y+z)