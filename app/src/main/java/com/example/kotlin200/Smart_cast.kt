package com.example.kotlin200

//스마트 캐스팅
//특정 조건을 만족하는 경우 , 컴파일러는 변수타입을 다른타입으로 자동 캐스팅한다.


fun main(){
    val number:Int?=null
    val number2=1225

    checkNull(number)
    checkNull(number2)
}

fun checkNull(any:Any?){
    if(any==null){
        println("null입니다")
        return
    }
    println(any.toString())
}