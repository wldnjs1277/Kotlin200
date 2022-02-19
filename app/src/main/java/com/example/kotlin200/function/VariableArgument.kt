package com.example.kotlin200

//가변인수

fun main(){
    println(getsum(1,2,3))
}

fun getsum(vararg numbers:Int):Int{
    val count = numbers.size
    var i =0
    var sum =0
    while(i<count){
        sum+=numbers[i]
        i++
    }
    return sum
}

