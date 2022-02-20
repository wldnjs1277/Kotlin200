package part2

// Object
//객체는 소프트웨어 관점에서 연관있는 변수들을 묶어놓은 데이터 덩어리

fun main(){
    val myName="jiwon"
    val myAge=27
    println(myAge)
    println(myName)

    val myinformation=object {
        //객체안의 변수들을 Property라고 한다.
        val name:String="jiwon"
        val age:Int=27
    }

    println(myinformation.age)
    println(myinformation.name)
}