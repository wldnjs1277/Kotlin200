package com.example.kotlin200

//문자 타입
//Char

fun main(){
    var ch:Char = 'A'
    println(ch)
    //코틀린코드에서 작은따옴표안에 \u코드를 입력하면 그번호에 해당하는 문자로 치환한다.
    var a='\uAC01'
    println(a)
    ch = '\uAC00'
    println(ch)
    ch='한'
    println(ch)
    println(ch.toInt())
    println(ch.code)
    //코틀린에서 toInt는 더이상 사용되지 않으므로 code를 사용한다.
    //ch.code 코드를 반환한다.
    //ch.toInt() 는 아스키코드 값을 반환한다.

}