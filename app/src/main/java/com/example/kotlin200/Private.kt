package com.example.kotlin200

//private

private var num = 10

private fun print(){
    println(num)
}
fun hello(value:Int){
    num=value
    print()
}
class Person1(age:Int){
    var age=age
    private set //setter가 private으로 PERSON1클래스 내부에서만 접근가능
    val isYoung get() = age<30
}
fun main(){
    print()
    val person=Person1(27)
    //person.age=20 setter가 private으로 PERSON1클래스 내부에서만 접근가능
    println(person.isYoung)
}