package com.example.kotlin200.`class`

//추상클래스

//학생,교수,직원 클래스를 하나의 타입으로 묶어주는 person클래스
class Person(){
    open fun getsalary()=0
}
//학생클래스
class Student(private val money:Int):Person(){
    override fun getsalary()= -money
    }
}
//교수 클래스
class Professor(private val classCount:Int):Person(){
    override fun getsalary()= classCount*120
}
//직원 클래스
class Employee(private val ):Person()
fun main(){

}