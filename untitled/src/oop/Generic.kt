package oop

//send varible but dont know the data type of an object

class userAdmin<T>(credit:T){
    init {

            println(credit)

    }

}
fun main(args:Array<String>)
{
    var userAdmin=userAdmin("hussain") //autoget
    var userAdmin1=userAdmin<Int>(123456)
    var userAdmin2=userAdmin<Double>(123.45)

}