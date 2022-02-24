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
    // person변수는 실제 값을 가지지 않고 객체의 좌표를 저장한다
    // 이러한 변수를 참조변수라고 한다. 객체의 좌표값은 참조값
    //힙 영역에 생성한 변수는 블록을 빠져나와도 지워지지 않는다.

    //가비지 컬렉션

    //객체의 위치를 기억하고 있는 참조변수가 사라지면 객체는 힘 영역에 존재하지만 위치를 모르기 때문에 다시 찾을수 없다.
    //이렇게 된 객체가 메모리 공간이 부족할 정도로 쌓이면 가비지 컬렉션이라는 기능에 의해 소멸된다.
    //언제인지는 모르지만 많은 객체가 힙에 쌓이면 시스템이 자동으로 가비지 컬렉션을 수행한다.

    val person= createPerson()
    printmyInfo(person)

}

fun absolute(number:Int):Int{
    return if(number>=0){
        number
    }else{
        -number
    }
}

class Person{
    var name=""
    var age=0
}
fun createPerson():Person{
    val my = Person()
    my.name="JIWON"
    my.age=27
    return my
}
fun printmyInfo(person:Person){
    println("이름=${person.name}")
    println("나이=${person.age}")
}


