package com.example.kotlin200.operator

//연산자 오버로딩
//코틀린은 언어에서 정해져 있는 연산자만 오버로딩 할 수 있다.
/*
* 함수명이 plus 이면 a+b
* minus 이면 a-b
* times = a*b
* div = a/b
* rem = a%b*/

fun main(){
    val pt1=Point(1,2)
    val pt2=Point(2,3)
    val pt3=pt1+pt2
    pt3.print()
    val pt4=pt3*3
    pt4.print()
    val pt5=pt4%2
    pt5.print()
    val pt6=-pt5
    pt6.print()

    val person=Person("jiwon","0628")
    println(person[0])
    person[0]="Leejiwon"
    println(person.name)

}

class Point(var x:Int=0,var y:Int=0){
    operator fun plus(other:Point):Point{
        return Point(x+other.x , y+other.y)
    }
    operator fun minus(other:Point):Point{
        return Point(x-other.x , y-other.y)
    }
    operator fun times(number:Int):Point{
        return Point(x*number,y*number)
    }
    operator fun div(number:Int):Point{
        return Point(x/number,y/number)
    }
    operator fun rem(number:Int):Point{
        return Point(x%number,y%number)
    }
    operator fun unaryMinus():Point{
        return Point(-x,-y)
    }
    fun print(){
        println("x=$x y=$y")
    }
}

//번호 붙은 접근 연산자

class Person(var name:String,var birthday:String){
    operator fun get(Position:Int):String{
        return when(Position){
            0 -> name
            1 -> birthday
            else -> "알수없음"
        }
    }
    operator fun set(Position: Int,value:String){
        when(Position){
            0->name=value
            1->birthday=value
        }
    }
}
