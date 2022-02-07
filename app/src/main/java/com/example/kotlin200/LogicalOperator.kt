package com.example.kotlin200

//논리연산자
/*
* a&&b a와 b가 모두true면 true 아니면 false
* a||b a와 b중 하나라도 true면 true 아니면 false
* !a a가true 면 false false면 true*/
fun main(){
    val a = 15
    val b = 17
    var bool:Boolean
    bool = (a-b<a+b)&&(a==15)
    println(bool)

    bool = !((a+b)>(a*3)||(b-a)>0)
    println(bool)

}