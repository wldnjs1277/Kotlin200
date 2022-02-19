package com.example.kotlin200

//Override
//같은 함수의 이름을 여러개 선언하는것을 함수의 오버로딩이라고 한다.
fun main(){
    val test = Test()
    val test1= Test1()
    test.printing()
    test1.printing()
}
open class Test(){
    open fun printing(){
        println("Test")
    }
}
class Test1():Test(){
    override fun printing() {
        println("TEST1")
    }
}