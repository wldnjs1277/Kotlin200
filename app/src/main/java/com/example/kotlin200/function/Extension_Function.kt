package com.example.kotlin200.function

//확장함수
//isNumber확장함수는 String의 맴버함수 인것처럼 호출 할 수 있다.
//확장 함수를 선언하는것은 함수 이름앞에 '함수를 주입할 클래스.'을 붙여주면 된다.
//함수를 주입할 클래스를 리시버 타입이라고 한다.
fun String.isNumber():Boolean{
    var i:Int = 0
    while (i<this.length){         //this를 사용하면 리시버 타입의 프로퍼티나 멤버 함수에 접근할 수 있다.
                                   //private나 protected에는 접근할 수 없다.
        //숫자가 아닌 문자가 들어있으면 false를 반환
        if(!('0'<=this[i]&&this[i]<='9'))
            return false
        i+=1
    }
    //조건을 통과하면 true를 반환
    return true
}


fun main(){
    val a:String="12345677890"
    val b:String="1000원"
    println(a.isNumber())
    println(b.isNumber())

}