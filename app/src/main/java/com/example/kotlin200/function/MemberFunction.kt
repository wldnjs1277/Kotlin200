package com.example.kotlin200.function

//맴버함수

fun main(){
    val person=Person()
    person.name="jiwon"
    person.age=27
    printPerson(person)
    person.print(17)
}

class Person{
    var name=""
    var age=0
    //프로퍼티와 맴버 변수 이름이 같을때


    fun print(age:Int){
        println("이름"+this.name)
        println("나이${age}") //변수 이름을 그냥적으면 매개변수로 인식
        println("나이"+this.age)
        //this는 해당위치에서 가장 가까운 범위의 클래스르 가르키는 키워드
    }
}
//Person 클래스의 인스턴스를 출력하는 함수가 있다.
//이러한 함수는 클래스 안으로 내장 시킬 수 있다.
//클래스안에 내장된 함수를 맴버 함수라고 부른다.
fun printPerson(person: Person){
    println("이름"+person.name)
    println("나이"+person.age)
}