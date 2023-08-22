package chop03.section1

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

fun main(){
    normalVarargs(1,2,3)
}
fun normalVarargs(vararg counts : Int){
    for(num in counts){
        print("$num ")
    }
    println("")
}