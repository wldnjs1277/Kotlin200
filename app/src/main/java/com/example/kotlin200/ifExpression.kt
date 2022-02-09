package com.example.kotlin200

//if를 표현식으로 사용하기

fun main(){
    val value:Int = if(10>5){
        println("10은 5보다 크다")
        10
    }else{
        println("10은 5보다 크지 않다")
        5
    }
    println(value)
}