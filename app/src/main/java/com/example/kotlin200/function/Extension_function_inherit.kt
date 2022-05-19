package com.example.kotlin200.function

//확장함수의 리시버 타입이 상속관계에 있을 때

open class AAA
class BBB:AAA()

fun AAA.hello()= println("aaa")
fun BBB.hello()=println("bbb")


fun main(){
val test:AAA=BBB()
    test.hello()
}

//확장함수는 팜조변수가 실제로 가리키는 객체 타입을 따르지 않고 참조변수 타입을 그대로 따른다.