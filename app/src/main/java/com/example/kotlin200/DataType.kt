package com.example.kotlin200

//정수 타입과 실수 타입

/*
* -정수타입-
* Byte 용량은 1Byte
* Short 용량은 2Byte
* Int 욜양은 4Byte
* Long 용량은 8Byte
* -실수타입-
* Float 용량은 4Byte
* Double 용량은 8Byte
* */
fun main(){
    val a:Byte=125
    val b:Short=(100+200)*100
    var c:Int = 12_4354_6538
    c = a+b
    println(c)
    var d:Long
    d=c+10L  //정수 리터럴뒤에 L을 붙이면 크기에 상관없이 Long타입이 된다.
    println(d)

}