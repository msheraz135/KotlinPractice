package functions

fun main(args:Array<String>)
{
    var array = intArrayOf(1,2,3,4,5,6)
     println( " \n"+ sum(88,55,*array,55,66))
    /*var r=sum(10.2,2.0)
    println("\n sum is $r")*/
}
fun sum(vararg number:Int):Int
{ var sum=0
    for (number in number)
    {
        print(" $number,")
        sum+=number
    }
    return sum

}