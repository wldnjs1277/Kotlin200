package com.example.kotlin200.접근지정자


//접근 지정자 오버라이딩
//오버라이딩을 통해 protected인 프로퍼티나 맴버함수의 접근 지정자를 public으로 변경가능

open class AA(protected open val number:Int){
    protected open fun hello(){
        println("hello")
    }
    protected open fun hi(){
        println("hi")
    }
}
class BB(number: Int):AA(number){
    public override val number: Int
        get() = super.number

    public override fun hello()= super.hello()
    override fun hi()=super.hi()
    }

fun main(){
    val bb=BB(27)
    val aa:AA=bb
    //println(aa.number) number가 protected이므로 오류 hello함수도 protected이므로
    //aa.hello() hello함수도 protected이므로 오류
    println(bb.number)
    bb.hello()
    //bb.hi()
}

