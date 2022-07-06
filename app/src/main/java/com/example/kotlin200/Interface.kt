package com.example.kotlin200

//Interface
//인터페이스는 클래스에 맴버 함수와 프로퍼티가 존재한다는 것을 보장하기 위한 장치

interface Printable{
    fun print()
}
class AA:Printable{
    override fun print(){
        println("AA")
    }
}
fun print(anything:Printable){
    anything.print()

}


fun main(){
    print(AA())
}