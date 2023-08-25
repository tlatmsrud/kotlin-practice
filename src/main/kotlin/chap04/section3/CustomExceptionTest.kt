package chap04.section3

/**
 * title        :
 * author       : sim
 * date         : 2023-08-25
 * description  :
 */

class InvalidNameException(message : String) : Exception(message)

fun validateName(name: String) {

    if(name.matches(Regex(".*\\d+.*")))
        throw InvalidNameException("continas number")
}

fun main() {

    var name = "kildong123"

    try{
        validateName(name)
    }catch(e : InvalidNameException){
        println(e.message)
    }catch(e : Exception){
        println(e.message)
    }
}