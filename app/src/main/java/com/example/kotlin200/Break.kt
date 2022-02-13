package com.example.kotlin200

//break를 이용하여 반복문을 탈출할수 있다.

fun main(){
    var i = "*"
    //while의 조건이 true이므로 무한 반복 된다.
    while(true){
        println(i)
        i+="*"
        if(i.length==6){
            break
        }
    }
}