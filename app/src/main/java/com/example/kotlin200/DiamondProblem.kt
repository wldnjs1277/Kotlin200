package com.example.kotlin200

//다이아몬드 문제
//상속

interface Parent{ fun follow() }

interface Mother:Parent{
    override fun follow()= println("follow Mother")
}
interface Father:Parent{
    override fun follow()= println("follow Father")
}
class Child:Mother,Father{
    override fun follow(){
        println("child")
        super<Mother>.follow()     //Child클래스는 Mother interface와 Father interface를 구현하고 있어
                                   //super.follow()를 하면 호출이 애매해진다. super뒤에 <>로 호출할 맴버함수를 지정한다.
    }
}

fun main(){
    Child().follow()
}