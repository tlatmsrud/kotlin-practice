package chop03.section3

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main() {
    var result : Int
    val multi = {x: Int, y: Int -> x*y} // 일반 변수에 람다식 할당
    result = multi(10,20)
    println(result)

    var multi1 : (Int, Int) -> Int = {x: Int, y: Int -> x+y}
    var multi2 = {x: Int, y: Int -> x+y}
    var multi3: (Int, Int) -> Int = {x,y -> x*y}

    val greet = {println("HelloWorld")}
    val square = {x : Int -> x*x}

    println(square(3))
}