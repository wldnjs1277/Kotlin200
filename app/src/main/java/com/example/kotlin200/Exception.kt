package com.example.kotlin200

import java.lang.Exception
import java.lang.NumberFormatException

//예외

fun main(){
    val str="abc"
    //val num=str.toInt() //숫자가 아닌 문자열을 Int타입으로 변환 하려하면 변환에 실패하고 예외가 발생한다.
    //예외가 발생하면 프로그램이 강제종료되며 그 아래 코드들은 실행되지 않는다.
    //println(num)

    //예외 처리
    try {        //예외가 발생할 가능성이 있는 부분을 try블록에 넣는다.
        val str1="abc"
        val num1=str1.toInt()

        println(num1)
    }
    //catch블록에는 어떤 예외가 발생햇을때 catch블록ㅇ르 실행할지를 지정한다.
    //NumberFormatException=예외 타입이다.
    //여러종류의 예외를 처리하려면 catch블록을 여러개 두면 된다.
    catch (e:NumberFormatException){
        println("문자열을 숫자로 변경하지 못함")
    }

    //finally는 생략가능
    //예외 발생 여부와 상관없이 무조건 실행된다.
    finally {
        println("프로그램 종료")
    }
    /////////////////////////////////
    try {
        something()
    }
    catch (e:Exception){
        println(e.message)
    }
}


//예외 던지기
fun something(){
    val num1 =10
    val num2=0
    div(num1,num2)
}
fun div(a:Int,b:Int):Int{
    if(b==0){
         println("0으로 나눌수 없다")
    }
    return a/b
}

