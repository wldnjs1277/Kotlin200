package com.example.kotlin200

//null

fun main(){
    //타입이름뒤에?를 붙히면 변수를 null값을 지정할수 있게 만들 수 있다.
    val num:Int?=null
    //엘비스 연산자 ?: 피연산자가 null이 아니면 값을 그대로 쓰고 null 이면 :뒤의 피연산자로 대채한다,
    println(num?:5)
    var abc:Abc?=Abc(1,2)
    //nullable한 참조변수의 프로퍼티와 맴버함수에 접근하려면 ?.을 반드시 사용해야 한다.
    abc?.print()
    //!!을 사용하면 nullable 타입을 not-null로 강제 캐스팅 한다.
    abc!!.print()
    abc=null
    ////////////////
    val empty:String?=null
    empty.isNumber()

}
class Abc(val a:Int=0,val b:Int=1){
    fun print(){
        println(a+b)
    }
}
//nullable리시버
fun String?.isNumber(){
    if (this==null){
        println("문자열이 null")
    }
}
