package part2

//Class

fun main(){
    //참조변수를 초기화 하지 않은채 프로퍼티에 접근하면 오류가 발생한다.
    val person=Person()
    person.age=27
    person.name="jiwon"
    println(person.age)
    println(person.name)
    val person1=Person()
    person1.name="person1"
    person1.age=0

}
//클래스를 이용하면 같은 모양의 객체를 대량 생산할 수 있다.
//클래스로 생성된 객체를 Instance라고 부르기도 한다.
class Person(){
    var name:String=""
    var age:Int=0
}