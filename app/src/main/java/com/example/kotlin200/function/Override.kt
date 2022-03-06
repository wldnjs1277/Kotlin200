package com.example.kotlin200

//Override
//같은 함수의 이름을 여러개 선언하는것을 함수의 오버로딩이라고 한다.
fun main(){
    val test = Test()
    val test1= Test1()
    test.printing()
    test1.printing()

    val aaa=AAA()
    val bbb=BBB()
    bbb.number=5
    bbb.number
}
open class Test(){
    open fun printing(){
        println("Test")
    }
}
class Test1():Test(){
    override fun printing() {
        super.printing()
        println("TEST1")
    }
}
//프로퍼티 오버라이딩 하기

open class AAA(){
    open var number=10
    get(){
        println("AAA getter호출")
        return field
    }
    set(value){
        println("AAA setter호출")
        field=value
    }
}
class BBB:AAA(){
    override var number: Int
        get(){
            println("BBB getter호출")
            return super.number

        }
        set(value) {
            println("BBB setter호출")
            super.number=value
        }
}