package com.example.kotlin200.Programmers

fun main(){
    println(solution("Bcad"))
    }

//문자열정렬하기2
fun solution(my_string: String): String {
    var answer: String = ""
    var a= my_string.lowercase()
    answer=a.split("").sorted().joinToString("")
    return answer
}

//세균증식 문제
/*
fun solution(n: Int, t: Int): Int {
    var answer: Int = 0
    val a=Math.pow(2.0,t.toDouble())*n
    answer=a.toInt()
    return answer
}*/

//아이스 아메리카노
//프로그래머스는 정답인데 안드로이드 스튜디오에서는 주소만뜸.....
/*
fun solution(money: Int) = intArrayOf(money / 5500, money % 5500)
*/
//문자열안에 문자열
/*
fun solution(str1: String, str2: String): Int {
    var answer: Int = 0
    if(str1.contains(str2)){
        answer=1
    }else{
        answer=2
    }
    return answer
}*/


//특정 문자 제거하기
/*fun solution(my_string: String, letter: String): String {
    var answer: String = ""
    answer= my_string.replace(letter,"")

    return answer
}*/





//제곱수 판별하기
/*
fun solution(n: Int): Int {
    var answer: Int = 0
    val a=kotlin.math.sqrt(n.toDouble())
    if(a.toInt()*a.toInt()==n){
        answer=1
    }else{
        answer=2
    }
    return answer
}*/
//자릿수 더하기
/*
fun solution(n: Int): Int {
    var answer: Int = 0
    var a=n
    while (a!=0){
        answer+=(a%10)
        a=a/10
   }
    return answer
}*/

//피자 나눠 먹기
/*피자는 7조각 한사람당 1조각 먹기

fun solution(n: Int): Int {
    var answer: Int = 0
    answer=(n-1)/7+1
    return answer
}
*/

//키큰 사람 찾기
/*
fun solution(height: Int): Int {
    var answer: Int = 0
    val array= arrayOf(149, 180, 192, 170)
    answer= array.count {it>height}
    return answer
}*/

//중복된 숫자 갯수
/*
fun solution( n: Int): Int {
    var answer: Int = 0
    val array= arrayOf(1, 1, 2, 3, 4, 5)
    answer= array.count {it==n}
    return answer
}*/

//편지문제
/*
fun solution(message: String): Int {
    var answer: Int = 0
    answer= message.length*2
    return answer
}*/

//프로그래머스 양꼬치 문제
/*fun solution(n: Int, k: Int): Int {
    var answer: Int = 0
    val a =kotlin.math.floor((n/10).toDouble())
    answer=(n*12000)+(k*2000)-(a.toInt()*2000)
    return answer
}*/
