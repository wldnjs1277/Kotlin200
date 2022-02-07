package com.example.kotlin200

//비트연산자
/*
* 코틀린의 비트 연산자는 기호가 아닌 문자로 되어있다.
* and연산 자바에서 &
* or연산 자바에서 |
* xor연산 자바에서 ^
* 12345.inv() 자바에서 ~12345   12345를 비트단위로 반전 시킨다.
* 1shl3 (1을 왼쪽으로 3칸 시프트) 자바에서 1<<3
* 1shr3 (1을 오른쪽으로 3칸 시프트) 자바에서 1>>3
* -1ushr3(부호를 유지한책 -1을 오른쪽으로 3칸시프트) 자바에서 -1>>>3
* */

fun main(){
    println(1 and 3)
    println(1 or 2)
    println(1 xor 3)
    println(12345.inv())
    println(1 shl 3)
    println(10 shr 4) //시프트 연산자는 값이 허용범위를 넘어가버리면 없는 값이 되어버린다.
    println(-4 ushr 1)

}