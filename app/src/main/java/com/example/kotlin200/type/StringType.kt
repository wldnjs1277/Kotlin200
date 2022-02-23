package com.example.kotlin200

//문자열 String

fun main(){
    var str:String="Hello"
    println(str)
    str = str+"\nKotlin!"
    println(str)
    println(str[0])
    val num = 10*5+3
    println(str+num)

    var first="Hello"
    val second="world"
    first+=second
    println(first)
}

//문자열간 +연산시 주의점
//문자열은 힙 영역에 생성된다.
//문자열간에 +연산시 기존의 문자열은 그대로 나모 새로운 문자열이 새로 생성된다.
//문자열에 + 연산을 계속하면 메모리 공간이 모두 차지 될 것이다.