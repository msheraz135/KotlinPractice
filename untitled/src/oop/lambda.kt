package oop

fun Sum(num :Int,num2:Int):Int {
    return num + num2
}
val sumLambda = {num1:Int,num2:Int -> num1+num2}

fun main(){
    val add=Sum(5,3)
    println(add)
    println(sumLambda(666,555))

    val list= listOf(10,15,20,25,30,35,40)
    var nn:Int=0
    for (n in list)
    {
        nn += n

    }
    println(nn)

    list.forEach { number ->
        println(number)
    }
}