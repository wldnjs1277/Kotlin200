package com.example.kotlin200.Class

//constructor/init


fun main(){
    val human=Human(name = "name", age = 1,"LEE")
    println("이름은${human.name}")
    println("나이 ${human.age}")
    val human1=Human()
    println(human1.name)
    println(human1.age)

}
//constructor는 생략가능
//생성자도 함수의 일종이므로 디폴트 인수와 가변인수를 사용할 수 있다.
//생성자 매개변수는 init블록뿐 아니라 프로퍼티 선언과 동시에 초기화 하는데 사용가능
class Human /*constructor*/(name:String="jiwon",age:Int=27,firstname:String="Lee"){
    val name:String
    val age:Int
    //init블록안에서 프로퍼티를 초기화 하면 생성과 동시에 하지 않아도 된다.
    //init은 인스턴스가 생성될때 호출되는 함수이다.
    init {
        println("첫번째 init")
        this.name=name
        this.age=age
    }
    val fullname:String = firstname+this.name

    //init은 여러개 사용가능
    init {
        println("두번째 init")
        println(fullname)
    }
}

