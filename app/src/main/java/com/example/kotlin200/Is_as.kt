package com.example.kotlin200

//is
//is 연산자로 객체의 타입을 알아낼 수 있다.
// !is 는 is의 반대

fun main(){
    val person:Information=Student("jiwon",27,"123456")

    println(person is Information)
    println(person is Student)
    println(person is Professor)

    val person2:Information=Professor("zz",12)

    println(person2 is Information)
    println(person2 is Student)
    println(person2 is Professor)


    var person3:Student?=person as Student
    //캐스팅에 실패했을 때 예외가 발생하는것을 막고싶으면 as?연산자를 사용해야 한다. as? = 캐스팅에 실패하면 null값을 반환한다.
    person3=person2 as? Student
}

class Professor(name:String,age:Int):Information(name, age)
open class Information(val name: String,val age: Int)
class Student(name: String,age: Int,Id:String):Information(name, age)