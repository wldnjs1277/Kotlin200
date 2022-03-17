package com.example.kotlin200

//null

fun main(){
    //타입이름뒤에?를 붙히면 변수를 null값을 지정할수 있게 만들 수 있다.
    var num:Int?=null
    num=10
    println(num)
    var abc:Abc?=Abc(1,2)
    //nullable한 참조변수의 프로퍼티와 맴버함수에 접근하려면 ?.을 반드시 사용해야 한다.
    abc?.print()
    abc=null


}
class Abc(val a:Int=0,val b:Int=1){
    fun print(){
        println(a+b)
    }
}