package com.example.kotlin200.Class

//프로퍼티와 Getter/Setter

fun main(){

    val person=Person3()
    person.age=-30        //프로퍼티에 값을 대입하면 이 프로퍼티에 해당하는 setter가 호출된다.
    println(person.age)
}
class Person3{
    var age:Int=0
    get() {
        return field //field는 값이 저장되는 프로퍼티 속의 변수를 나타낸는 특수 식별자
    }
        //setter의 value는 저장하려는 값을 담는 매개변수
    set(value) {
        field=if(value>=0){
            value
        }else{
            0
        }
    }
}