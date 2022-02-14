package com.example.kotlin200

//Function

fun main(){
    //3과5를 인수로 받는 testfun을 출력
    println(testfun(3,5))
}
//리턴타입이 Int이고  타입이 Int인 a,b를 매개변수로 가지는 testfun함수
fun testfun(a:Int,b:Int):Int{
    println("a=$a,b=$b")
    return a+b
}
