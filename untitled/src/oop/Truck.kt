package oop

class Truck:car {

    public var Subtype:String ?= null

    constructor(type:String, model:Int,price:Double,milesDrive:Int,owner:String, subtype:String):super(type,model,price,milesDrive, owner,){

        this.Subtype=subtype
    }
    constructor( type:String, model:Int,price:Double,milesDrive:Int,subtype:String) : super(type,model,price,milesDrive)
    {
        this.Subtype=subtype
    }

    override fun getCarPrice(): Double {
          /**
           * price is private cant be access withh 'THIS' key word
           * and  misleDrive is public we can call it with super *
           */
        return this.GetPrice() -(super.milesDrive!! *20)
    }
    fun getPriceEvaluationFromParentCar():Double
    {
        return super.getCarPrice()                                        /** super and this differnce**/
    }

}
fun main(args:Array<String>)
{
    var truck1 = Truck("Bmw",2015,12658.3,105,"sheraz","Dumper")
    var price = truck1.getCarPrice()

    println("price is:$price")
    println(truck1.getCarPrice())
    println(truck1.type)
    println(truck1.Subtype)
    truck1.type="ferrari"
    println(truck1.type)


    /*var car2 = car("MG",204545,12654448.3,105,"shzia")
    var price2 = car.getCarPrice()*/
}