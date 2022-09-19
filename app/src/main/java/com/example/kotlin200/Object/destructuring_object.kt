package com.example.kotlin200.Object

//객체 분해하기
//----
data class Employee(val name:String,val age:Int,val salary:Int)


fun main(){
    //사용하지 않는 변수의 이름은 _를 지정하여 무시할 수 있다.
val (name, _,salary)=Employee("jiwon",27,300)
println(name);println(salary)
}