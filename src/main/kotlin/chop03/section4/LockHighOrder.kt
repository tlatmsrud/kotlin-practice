package chop03.section4

import java.util.concurrent.locks.ReentrantLock

/**
 * title        :
 * author       : sim
 * date         : 2023-08-22
 * description  :
 */

var sharable = 1

fun main(){
    val reLock = ReentrantLock()
    lock(reLock, { criticalFunc() })
    lock(reLock){ criticalFunc() }
    lock(reLock, ::criticalFunc)

    println(sharable)
}

fun criticalFunc(){
    sharable +=1
}

fun <T> lock(reLock: ReentrantLock, body: () -> T){
    reLock.lock()
    try{
        body()
    }finally {
        reLock.unlock()
    }
}