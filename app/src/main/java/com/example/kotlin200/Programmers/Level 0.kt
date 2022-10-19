package com.example.kotlin200.Programmers
fun main(){
println(solution(64,6))
}
//프로그래머스 양꼬치 문제
fun solution(n: Int, k: Int): Int {
    var answer: Int = 0
    val a =kotlin.math.floor((n/10).toDouble())
    answer=(n*12000)+(k*2000)-(a.toInt()*2000)
    return answer
}
