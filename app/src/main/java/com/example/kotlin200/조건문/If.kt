package com.example.kotlin200

//조건문 if

fun main(){
    var a = 15
    val b = 10
    if(a>b){
        println("if문안으로 들어옴")
        a-=b
    }
    println(a)

    //흐름제어 if-else
    if(a>b){
        println("if문 \n a가 더 크다")
    }else{
        println("else문 \n b가 더 크다")
    }

}