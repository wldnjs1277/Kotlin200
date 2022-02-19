package com.example.kotlin200

//산술연산자
//연산자도 피연산자타입과 결과타입이 같아야 한다.
// %는 나눗셈의 일종으로 +,=연산자보다 우선순위가 높다.
fun main(){
    val num:Int=15-4*3   //코틀린은 사칙연산의 법칙을 따르기 때문에 곱하기가 먼저수행된다.
    val num2:Int=65%7    // %는 65를 7로 나눈 나머지
    val num3:Double=7.5/5+22.25 // Double/Int타입을 하면 Double타입의 결과가 나온다.
    // 계산결과에 소수점이 남지않아도 결과타입은 Double
    val num4:Double=num/num2+0.7
    //Int 타입끼리 산술연산을 하면 Int타입의 결과가 나오므로 num/num2 = 1.5가아닌 1이 나온다
    //계산결과에 소수점이 존재한다 해도 절대 보존되지 않는다.
    // num4의 결과 값이 2.2가 나오려면 형변환을 시켜주면된다.
    val num5:Double=num.toDouble()/num2+0.7

    println(num)
    println(num2)
    println(num3)
    println(num4)
    println(num5)
}