package com.example.kotlin200

//메모리의 스택영역

//메모리에는 스택영역이 있다.
//이곳에 변수가 저장되고 변수가 생성되는 순서대로 쌓여서 스택영역이라는 이름이 붙었다.

fun main(){
    val a = 1
    val result = absolute(a)
    println(result)
    //a라는 변수가 스택영역에 가장먼저 쌓이고 result = absolute 함수에 a를 인자로 받는다
    //absoulte 함수를 호출하여 number라는 매개변수가 생성 되어 스택영역에 쌓인다.
    //absolute함수가 종료되면서 number가 스택영역에서 사라지고
    //result가 스택영역에 생성된다.
    //main함수가 종료되면 스택영역이 전부 사라진다.

    //----------------------------------------
    //메모리의 힙 역역
    //객체는 힙 역역에 생성된다.
    //
    val person=object { // person변수는 실제 값을 가지지 않고 객체의 좌표를 저장한다
                        // 이러한 변수를 참조변수라고 한다. 객체의 좌표값은 참조값
        val name="jiwon"
        val age=27
    }
    println(person.age)
    println(person.name)

}

fun absolute(number:Int):Int{
    return if(number>=0){
        number
    }else{
        -number
    }
}


