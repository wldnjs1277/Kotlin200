package com.example.kotlin200.`class`

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
class Employee(private val money:Int,private val year:Int):Person(){
    override fun getsalary()=money*(1.0+year/10.0).toInt()
}
//////////////////////////////////////////////
//클래스를 추상클래스로 만들려면 abstract키워드를 사용 추상클래스는 일부 맴버의 내용이 비어있는 불완전한 클래스
//그러므로 객체를 생성할 수 없다.
//abstract키워드는 open을 포함 하고 있음 , 추상클래스는 추상함수를 가질 수 있다.

//추상클래스
//공통되는 맴버를 전파하는 용도로 추상클래스를 사용
//학생,교수,직원 클래스를 하나의 타입으로 묶어주는 person클래스

abstract class PerSon(){
    abstract fun getSalary():Int
}
//학생클래스
class Student(private val money: Int):PerSon() {
    override fun getSalary() = -money
}
//교수클래스
class Professor(private val classCount:Int):PerSon(){
    override fun getSalary()= classCount*120
}
//직원클래스
class Employee(private val money:Int,private val year:Int):PerSon(){
    override fun getsalary()=money*(1.0+year/10.0).toInt()
}
fun main(){

}
