package com.example.kotlin200

//Nothing

fun main(){
    println("start")
    val i:Int= throwing()
    println(i)

}
//Nothing은 모든 클래스의 하위 클래스이다.
//Nothing은 어떤값도 포함하지 안고 객체도 반환하지 않는다.
fun throwing():Nothing{
    throw Exception()
}
