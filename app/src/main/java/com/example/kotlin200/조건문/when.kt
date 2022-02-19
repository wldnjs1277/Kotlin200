package com.example.kotlin200

//조건문 - when

fun main(){
    val score:Int=64

    when(score/10){
        6-> { println("D")}
        7-> { println("C")}
        8-> { println("B")}
        9,10->{println("A")}
        else->{println("F")}
    }
    println("test")

    val grade=when(score/10){
        6->"D"
        7->"C"
        7->"B"
        9,10->"A"
        else->"F"
    }
    println(grade+"점수")
}