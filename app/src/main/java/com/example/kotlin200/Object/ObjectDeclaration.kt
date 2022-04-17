package com.example.kotlin200.Object

//객체선언

object Person{
    var name:String=""
    var age:Int=0
    fun print(){
        println(name)
        println(age)
    }
}
fun main(){
    //식별자 Person으로 객체에 바로 접근 가능
    Person.name="jiwon"
    Person.age=27
    Person.print()
}