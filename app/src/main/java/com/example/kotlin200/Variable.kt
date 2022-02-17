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
    val b:Int=43+75+a
    println(b)
    total=a+b
    println(total)
    println(total+c)
}

//지역 변수와 전역변수

//변수가 인식될 수 있는 범위를 Scopㄷ 라고한다.
//지역변수는 블록안에서 선언된 변수
//블록 밖으로 나가면 사라진다

//전역변수는 블록빡에서 선언한 변수
//전역변수는 어떤함수에도 속해 있지 않기 때문에 모든함수에서 사용가능

