package com.example.kotlin200

//Interface
//인터페이스는 클래스에 맴버 함수와 프로퍼티가 존재한다는 것을 보장하기 위한 장치

interface Printable{
    fun print()
    val name:String //인터페이스는 프로퍼티에 값을 저장할수 없지만 getter를 이용하여 가능
    get() = "Interface name"
}
class AA:Printable{
    override fun print(){
        println("AA $name")
    }
}
fun print(anything:Printable){
    anything.print()

}


fun main(){
    print(AA())

}