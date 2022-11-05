package oop

import com.sun.tools.javac.Main

open class car()
{
    var type:String?=null
    var model:Int?=null
    private var price:Double?=null
    var milesDrive:Int?=0
    var owner:String?=null

    constructor( type:String, model:Int,price:Double,milesDrive:Int,owner:String) : this() {
        this.type=type
        this.model=model
        this.price=price
        this.milesDrive=milesDrive
        this.owner=owner
    }
    constructor( type:String, model:Int,price:Double,milesDrive:Int) : this() {
        this.type=type
        this.model=model
        this.price=price
        this.milesDrive=milesDrive

    }

    open fun getCarPrice():Double
    {
        return  this.price!! -(this.milesDrive!!*10)
    }
    fun GetPrice(): Double
    {
        return this.price!!
    }


    init {
        println("type:$type")
        println("model: $model")
        println("price:$price")
        println("milesDrive:$milesDrive")
        println("owner$owner")

    }

}
fun main( args: Array<String>)
{
  /*  //no constructor declaration nedded
    // no getter settre needed
    var car = car("Bmw",2015,12658.3,105,"sheraz")
    var price = car.getCarPrice()
    println("price is:$price")
    println(car.price)
    println(car.type)
    car.type="ferrari"
    println(car.type)


    var car2 = car("MG",204545,12654448.3,105,"shzia")
    var price2 = car.getCarPrice()*/

    val listOfCars = arrayListOf<car>()
    listOfCars.add(car("Bmw",2015,12658.3,105,"sheraz"))
    listOfCars.add(car("MG",204545,12654448.3,105,))
    for (cars in listOfCars)
    {
        println("-----------")
        println(cars.owner)
        println(cars.getCarPrice())

    }
    listOfCars[0].type="updated 1"
    listOfCars[1].type="updated 2"
    for (cars in listOfCars)
    {
        println("updated valuse of both cars\n" +
                " ${cars.owner} car type is ${cars.type}\n" )
    }

}