package oop
//casting
open class OperationAndOverrideing() {

   open fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
}
class MultiOperations() : OperationAndOverrideing() {

    override fun sum(n1: Int, n2: Int): Int {
        return n1+n2*3
    }
    fun sub(n1:Int,n2:Int):Int{
        return n1-n2
    }
    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }

}
fun main(args:Array<String>)
{
    var op=OperationAndOverrideing()
    var sum=op.sum(10,15)
    println("sum is: $sum")
    var div=op.div(12,11)
    println("div is: $div")

    var op2=MultiOperations() //as OperationAndOverrideing //casting
     sum=op2.sum(10,15)
    println("sum is: $sum")
     div=op2.div(10,15)
    println("div is: $div")


}