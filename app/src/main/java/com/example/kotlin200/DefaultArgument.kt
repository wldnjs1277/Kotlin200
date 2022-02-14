package com.example.kotlin200

//default Argument

fun main(){
    println(test(3,4))
    //함수 호출시 인수가 지정되지 않은 매개변수는 디폴트 값으로 초기화 된다.
    println(test(print=true))
}
fun test(a:Int=0,b:Int=0,print:Boolean=false):Int{
    val result = a+b
    if(print){
        println("print=$print")
    }
    return result
}
