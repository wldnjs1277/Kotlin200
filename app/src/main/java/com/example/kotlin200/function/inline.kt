package com.example.kotlin200.function

//inline함수
//inline함수는 재귀호출이 불가능하다.

inline fun hello(){
    println("hello")
    println("kotlin")
}
fun main(){
    hello()
    hello()
}