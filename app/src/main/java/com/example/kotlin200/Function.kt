package com.example.kotlin200

//Function

fun main(){
    //3과5를 인수로 받는 testfun을 출력
    println(testfun(3,5))
    test()
}
//리턴타입이 Int이고  타입이 Int인 a,b를 매개변수로 가지는 testfun함수
fun testfun(a:Int,b:Int):Int{
    println("a=$a,b=$b")
    return a+b
}

//Unit

//함수에 리턴타입을 생략하면 자동으로 Unit이 된다.
fun test(){
    println("test")
    //return 타입이 Unit이면 return 을 생략해도 된다.
    return //을 사용하려면 return 뒤에 표현식을 적지않아야 한다.
}
