package com.example.kotlin200

//변수
//var는 수정할 수 있는 변수
//val은 수정할 수 없는 변수
fun main(){
    //변수 = 값을 저장해놓는 공간
    //total처럼 임의로 지어낸 이름을 식별자라고 한다.
    //식별자에는 $를 사용할 수 없다.
    var total:Int
    total=0

    val a:Int=10+53-7
    println(a)
    val b:Int=43+75+a
    println(b)
    total=a+b
    println(total)
}