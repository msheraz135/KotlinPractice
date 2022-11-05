import kotlin.io.println as println1

fun main(args: Array<String> ){
    //var&val
    //  here read and writeable is var and val is only readonly
    println1("enter name")
    var name= readLine()
    println1("enter age")
    var age:Int= readLine()?.toInt() !! //not null or add -> ? for not null
    println1("enter department")
    var dep:String ? = readLine()
    println1("name $name have age of $age and work in department of $dep")
    val pi:Double = readLine()!!.toDouble()
    println1("value is $pi")

}