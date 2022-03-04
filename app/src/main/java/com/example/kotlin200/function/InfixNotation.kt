package com.example.kotlin200.function

//맴버함수의 중위표기법
//맴버함수의 매개변수가 하나뿐이면 함수호출을 중위표기법으로 할 수 있다.
fun main(){
    val pt=Point(1,2) move Point(0,1)
    println("x좌표${pt.x}, y좌표${pt.y}")
}
class Point(var x:Int=0,var y:Int=0){
    infix fun move(base:Point):Point{
        return Point(x-base.x,y-base.y)
    }

}