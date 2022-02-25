package part2

// === / !== 연산자
//=== 연산자를 이용하여 두 참조변수가 같은 객체를 가르키고 있는지를 확인한다 자바의 ==과 같다.

//코틀린의 == 연산자는 자바의 equals 메서드와 같다.
fun main(){
    val a=abc()
    val b=abc()
    println(a===b)
    val c = "c"
    val d = "c"
    println(c===d)
    a.name="abc"
    b.name="abc"
    println(a.name==b.name)
}
class abc {
    var name=""
}