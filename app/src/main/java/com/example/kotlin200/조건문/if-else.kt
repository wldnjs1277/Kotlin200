package com.example.kotlin200

//if와else의 중첩

fun main(){
    val score=88
    if(score>=90) {
        println("A")
    }else{
        if(score>=80){
            println("B")
        }else{
            if(score>=70){
                println("C")
            }else{
                println("F")
            }
        }
    }
}