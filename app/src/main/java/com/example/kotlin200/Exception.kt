package com.example.kotlin200

//예외

fun main(){
    val str="abc"
    val num=str.toInt() //숫자가 아닌 문자열을 Int타입으로 변환 하려하면 변환에 실패하고 예외가 발생한다.
    //예외가 발생하면 프로그램이 강제종료되며 그 아래 코드들은 실행되지 않는다.
    println(num)
}
