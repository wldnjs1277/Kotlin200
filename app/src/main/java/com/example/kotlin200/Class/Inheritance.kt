package com.example.kotlin200.Class

//상속
//상속은 하나의 클래스만 가능하다
fun main(){
    val my=My("jjj",2,"human")
    val mymy=Mymy("jiwon",27,"06-28")
    my.print()
    mymy.print()
}
open class My(val name:String,val age:Int,val type:String){
    open fun print(){
        println(name)
        println(age)
        println(type)
    }
}
//상속받는 서브클래스는 매개변수에 var나 val을 사용하지 않는다.
class Mymy(name:String,age:Int,val birth:String):My(name, age,type="human"){
    override fun print() {
        super.print()
        println(birth)
    }
}