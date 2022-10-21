package com.example.kotlin200.Programmers

fun main(){
println(solution(1))

}
//중복된 숫자 갯수
fun solution( n: Int): Int {
    var answer: Int = 0
    val array= arrayOf(1, 1, 2, 3, 4, 5)
    answer= array.count {it==n}
    return answer
}

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
