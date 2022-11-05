import java.util.Calendar

fun main (Args :Array<String>)
{
     println("Enter your DOB")
    var Dob:Int = readln()!!.toInt()

    var year= Calendar.getInstance().get(Calendar.YEAR)
    var age = year-Dob

    println("your age is $age")
}