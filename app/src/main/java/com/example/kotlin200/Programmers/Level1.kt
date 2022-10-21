package com.example.kotlin200.Programmers

fun main(){

}
//숫자 문자열과 영단어
fun solution(s: String): Int {
    var answer: Int = 0
    val a= arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    var str=s
    for(i in 0 until a.size){
        str=str.replace(a[i],i.toString())
    }
    answer=str.toInt()
    return answer
}