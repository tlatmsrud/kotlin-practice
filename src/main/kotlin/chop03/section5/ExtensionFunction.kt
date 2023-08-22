package chop03.section5

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main(){
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

fun String.getLongString(target: String) : String =
    if(this.length > target.length) this else target