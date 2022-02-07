package com.example.kotlin200

//배정연산자
//배정연산자는 변수에 값을 저장할때 사용하는 연산자

fun main(){
    val a:Int
    var b:Int

    a=10+5
    b=10
    b+=a//b에 a의 값을 누적
    println(b)
    b%=3//b에 3을 나눈 나머지를 b에 저장
    println(b)
}