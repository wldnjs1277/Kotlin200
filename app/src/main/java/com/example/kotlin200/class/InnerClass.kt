package com.example.kotlin200.`class`

//내부클래스
class Outer2(private val value:Int){
    fun print(){
        println(this.value)
    }

    inner class Inner(private val innervalue:Int){
        fun print(){
            println("Outer2 val= ${this@Outer2.print()}")
            println("Inner val = ${this.innervalue}")
            println("Outer2 val + Inner val = ${this.innervalue+this@Outer2.value}" )
        }
    }
}

fun main(){
    val instance = Outer2(10)
    val innerinstance:Outer2.Inner=instance.Inner(20)
    innerinstance.print()
}