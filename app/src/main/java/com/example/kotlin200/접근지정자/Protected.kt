package com.example.kotlin200.접근지정자

//protected

open class AAA(protected val number:Int)

class BBB(number:Int):AAA(number){
    fun print(){
        //aaa클래스의 number 프로퍼티에 접근 가능
        println(number)
    }
}

fun main(){
    val bbb=BBB(27)
    bbb.print()
    //println(bbb.number)
    //protected는 클래스외부에서는 접근이 불가능 클래스의 서브클래스에서는 접근가능
}