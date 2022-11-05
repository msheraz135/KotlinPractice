package oop

 interface op {
     fun sum(n1:Int,n2:Int){println(n1+n2)}
     fun div(n1:Int,n2:Int){println(n1/n2)}
}
class Userop:op{
    override fun sum(n1: Int, n2: Int) {
        println(n1+n2)
    }

    override fun div(n1: Int, n2: Int)
    {
        println(n1/n2)
    }

}
class Adminop:op{
    override fun sum(n1: Int, n2: Int) {
        println(n1+n2-2)
    }

    override fun div(n1: Int, n2: Int)
    {
        println(n1/n2-2)
    }

}
class master:op{

}
fun main(args:Array<String>)
{
    var adminop=Adminop()
    adminop.sum(4,5)
    var master=master()
    master.div(50,5)
}