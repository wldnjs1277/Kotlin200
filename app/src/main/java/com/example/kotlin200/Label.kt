package com.example.kotlin200

//Label
//Label은 특정 반복문앞에 붙인 이름
fun main(){
    var x = 0
    var y = 0
    var a = 0
    var b = 0

    while (x<=20){
        y=0
        while (y<=20){
            if(x+y==15&&x-y==5){
                break
            }
            y+=1
        }
        x+=1
    }
    //Label을 이용하지 않으면 while (x<=20)에 해당하는 반복문을 벗어 나지 못한다.
    println("레이블을 이용하지 않을때 x는 $x , y는 $y")


    test@while (a<=20){
        b=0
        while (b<=20){
            if(a+b==15&&a-b==5){
                break@test //break뒤에 레이블을 이용하여 레이블에 해당하는 반복문을 빠져나오게 된다.
            }
            b+=1
        }
        a+=1
    }
    println("레이블을 이용하엿을때 x는 $a , y는 $b")


}