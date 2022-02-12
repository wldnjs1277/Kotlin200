package com.example.kotlin200

//continue를 사용하면 반복문의 일부 문장을 무시하고 건너뛸 수 있다.

fun main(){
    var i = 0
    while (i<10){
        i++
        if(i%2==0)
            continue //if문의 조건이 맞으면 아래의 문장들을 스킵한다.
        println(i)
    }
}