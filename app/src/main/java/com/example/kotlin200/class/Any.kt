package com.example.kotlin200.`class`

//Any

//Any클래스는 모든 클래스의 슈퍼 클래스이다.
//Any클래스에는 3가지 맴버 함수가 있다.
//equals,hashCode,toString
//equals는 ==과 같다.
//hashCode는 객체 고유의 해시코드를 반환한다.
//toString은 String타입으로 변환한다.

class Building(val name:String="",val date:String="",val area:Int=0){
    override fun toString(): String {
      return "이름:${this.name}\n"+
        "건축일자:${this.date}\n"+
        "면적:${this.area}"
    }
}
fun main(){
    val building=Building("건물","2022",100)
    val building2=Building()
    println(building.toString())
    println(building.hashCode())
    println(building2.hashCode())
    println(building.equals(building2))
}