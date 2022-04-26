package com.example.kotlin200

//const
//val 변수앞에  const를 붙이면 변수에 접근하는 코드를 변수에 저장된 값으로 대체시킨다.

const val hello="hello"+"world"

object Foo{
    const val bar="bar"
}
fun main(){
    println(hello)
    println(Foo.bar)
}
