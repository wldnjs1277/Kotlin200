package com.example.kotlin200.Object

//동반자 객체

class Person1 private constructor(){

    companion object{
        fun create():Person1{
            countCreated+=1
            return Person1()
        }
        var countCreated=0
        private set
    }
}
//동반자 객체의 확장함수

fun main(){
    val a=Person1.create()
    val b =Person1.Companion.create() //클래스안에 Companion object 를 정의해놓으면 Companion이라는 실발자가 자동으로 생간다.
    //따라서 호출 방법을 위의 a,b처럼 할 수 있다.
    println(Person1.countCreated)
}