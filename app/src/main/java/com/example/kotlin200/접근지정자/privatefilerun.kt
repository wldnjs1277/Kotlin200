package com.example.kotlin200.접근지정자

fun main(){
    //num=5 private으로 접근할 수 없다.
    hello(10)
    //print() 함수도 private으로 접근할 수 없다.
    val person=Person1(11)
    println(person.age)
    //person.age=20 setter도 private로 접근할 수 없다.
    println(person.isYoung)
}