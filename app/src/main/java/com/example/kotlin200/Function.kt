package com.example.kotlin200

//Function

fun main(){
    //3과5를 인수로 받는 testfun을 출력
    println(testfun(3,5))
    println(testfun(6,7))
    test()
    test2()
}
//리턴타입이 Int이고  타입이 Int인 a,b를 매개변수로 가지는 testfun함수
//함수를 활용하면 중복되는 코드를 줄일 수 있다.
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

//함수에 포함된 문장이 한개이면 = 로 축약 가능하다.
fun test2()= println("test2")
