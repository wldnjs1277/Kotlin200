package com.example.kotlin200

//변수
//변수는 사용하기 전에 초기화 하여야 한다.
//var는 수정할 수 있는 변수
//val은 수정할 수 없는 변수

var c = 1 //전역변수
fun main(){
    //변수 = 값을 저장해놓는 공간
    //total처럼 임의로 지어낸 이름을 식별자라고 한다.
    //식별자에는 $를 사용할 수 없다.
    var total:Int
    total=0

    val a:Int=10+53-7
    println(a)
    printA()
    printA2()
    //서로 다른 지역변수 a이므로 값이 다르다.

    val b:Int=43+75+a
    val c:Int=3
    println(b)
    total=a+b
    println(total)
    println(total+c) // 전역변수 c보다 지역변수 c가 우선적으로 인식됨
    printC()


}
fun printC(){
    println("${c} 전역변수c를 출력")
}

//지역 변수와 전역변수

//변수가 인식될 수 있는 범위를 Scope 라고한다.
//지역변수는 블록안에서 선언된 변수
//블록 밖으로 나가면 사라진다

//전역변수는 블록빡에서 선언한 변수
//전역변수는 어떤함수에도 속해 있지 않기 때문에 모든함수에서 사용가능

//지역변수와 전역변수의 이름이 중복될 때

//지역변수와 전역변수 간에는 이름의 중복을 허용하기 때문에 오류가 발생하지 않는다.
//이름이 중복된 변수에 접근할 때는 실행되고 있는 코드와 가장 가까운 스코프 변수가 인식된다.

//지역변수와 다른 함수의 지역변수가 중복일 때
//지역변수간에 스코프가 겹치치 않기 때문에 이름만 같고 서로 다른 변수이다.

fun printA(){
    val a = 5
    println(a)
}
fun printA2(){
    val a = 7
    println(a)
}


