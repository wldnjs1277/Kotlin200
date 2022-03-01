package com.example.kotlin200.Class


//보조생성자
//class 구문안의 Constructor는 보조 생성자이다.
//보조생성자는 기본생성자를 반드시 상속받아야 한다.

fun main() {
    val person=Person2("jiwon",27)
    val person1=Person2("jiwon",27,"lee")
    println(person.name)
    println(person1.name)


}
class Person2(var name:String){
    init {
        println("init실행")
    }
    constructor(name:String,age:Int):this("이름${name}나이${age}"){
        println("1번째 보조생성자")
    }
    constructor(name: String,age: Int,firstname:String):this(firstname+name,age){
        println("2번째 보조생성자")
    }
}

