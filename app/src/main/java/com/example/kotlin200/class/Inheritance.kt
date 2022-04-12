package com.example.kotlin200.`class`

//상속
//상속은 하나의 클래스만 가능하다
fun main(){
    val my=My("jjj",2,"human1")
    val mymy=Mymy("jiwon",27,"06-28")
    my.print()
    mymy.print()

    //업캐스팅
    //코틀린에서는 서브 클래스의 인스턴스를 슈퍼클래스 타입으로 가리킬 수 있다.
    //타입이 Test 이기 때문에 Test1의 id 프로퍼티 에는 접근하지 못한다.
    val test:Test=Test1("jiwon",27,"id")

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
//업캐스팅
open class Test(val name:String,val age:Int)

class Test1(name: String,age: Int,val id:String):Test(name,age)