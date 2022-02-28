package com.example.kotlin200.Class


//보조생성자
//class 구문안의 Constructor는 보조 생성자이다.
//보조생성자는 기본생성자를 반드시 상속받아야 한다.

fun main() {
    val person=Person2("jiwon")
    println(person.age)
    val person1=Person2("jiwon",27,"lee")


}
class Person2(var name:String,var age:Int){
    init {
        println("init실행")
    }
    constructor(name:String):this(name, 27){
        println("보조생성자")
    }
    constructor(name: String,age: Int,firstname:String):this(firstname+name,age){
        println("2번째 보조생성자")
    }
}

