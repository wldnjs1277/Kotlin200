package com.example.kotlin200

//증감 연산자

fun main(){
    var a = 10
    var b = 5


    println(a++ +b) //a에 후위 증가 연산을한다.
    println(a)//위에서 a에 후위 증가 연산을 하였으므로 a는 11
    println(--b)//전위 감소연산을 하여 b값이 바로 감소된다.
}