package part2.Object

//클래스를 상속하는 객체

fun main(){         //object도 클래스 간에 상속하듯이 object: 뒤에 슈퍼클래스를 붙여주면된다.
    val custom:Person=object:Person("jiwon",27)
    {
        override fun print() {
            super.print()
            println("object")
        }
    }

    custom.print()
}

open class Person(val name:String,val age:Int){
    open fun print(){
        println("이름 = ${name}")
        println("나이 = ${age}")
    }
}

