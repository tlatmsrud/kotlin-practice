package chop03.section1

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main(){

    val name = "홍길동"
    val email = "hone@naver.com"

    add(name)
    add(name, email)
    defaultArgs()
    defaultArgs(200)
}

fun add(name : String, email : String = "default"){
    println("${name}님의 이메일은 ${email}입니다.")
}

fun defaultArgs(x : Int = 100, y: Int = 200){
    println(x+y)
}