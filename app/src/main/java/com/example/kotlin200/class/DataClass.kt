package com.example.kotlin200.`class`

//DataClass

data class Employee1(val name:String,
    val age:Int,val salary:Int)

fun main(){
    val first=Employee1("1번",11,300)
    val second=Employee1("2번",22,600)
    val third=first.copy()
    println(first.toString())
    println(second.toString())
    println(first==second)
    println(first==third)
}