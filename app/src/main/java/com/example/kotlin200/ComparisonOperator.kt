package com.example.kotlin200

//비교 연산자
/*
* a==b a와 b가 같은면true 아니면false
* a!=b a와 b가 다르면true 아니면false
* a>b a가 b보다 크면 true 아니면false
* a<b a가 b보다 작으면 true 아니면false
* a>=b a가 b보다 크거나 같으면 true 아니면false
* a<=b a가 b보다 작거나 같으면 true 아니면false
* */
fun main(){
    var isRight:Boolean=(10+70)>(3*25)
    println(isRight)

    isRight=false
    println(isRight)

    isRight=30==(10+20)
    println(isRight)
}