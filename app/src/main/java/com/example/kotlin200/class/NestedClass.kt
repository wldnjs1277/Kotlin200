package com.example.kotlin200.`class`

//중첩 클래스
//중첩 클래스는 형태만 내부에 존재할 뿐 실질적으로는 내용을 서로 공유할 수 없는 별개의 클래스
class Outer{
    class  Nested{
        fun hello()= println("중첩된 클래스")
    }
}

//
fun main(){
    val  instance:Outer.Nested=Outer.Nested()
    instance.hello()
}