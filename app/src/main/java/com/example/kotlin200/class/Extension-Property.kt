package com.example.kotlin200.`class`

//확장 프로퍼티

//문자열이 큰지 판단하는 확장 프로퍼티
//확장 프로퍼티는 Field가 존재하지 않아서 field 식별자를 사용할 수 없다.
val String.isLarge:Boolean
get()=this.length>=10

fun main(){
    val a:String = "123456"
    val b:String = "111111111111"
    println(a.isLarge)
    println(b.isLarge)
}