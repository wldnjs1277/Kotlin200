package com.example.kotlin200.`class`

//lateinit
//
fun main(){
    val rect=Rect()
    rect.pt= Point(5,5)
    rect.pt2= Point(10,10)

    rect.print()
}

//점 을 표현하는 클래스
class Point(val x:Int, val y:Int)

//사각형을 표현하는 클래스
class Rect{
    lateinit var pt:Point
    lateinit var pt2:Point

    val width:Int get()  = pt2.x-pt.x
    val height:Int get() = pt2.y-pt.y
    val area get() = width*height

    fun print(){
        println("너비"+ width)
        println("높이"+ height)
        println("넓이"+ area)
    }
}
