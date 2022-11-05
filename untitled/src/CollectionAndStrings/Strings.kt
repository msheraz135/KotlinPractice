package CollectionAndStrings

import java.util.*

fun main()
{
    //concatination
//        var string = readln().toString().uppercase(Locale.getDefault()).Trim()
    var array: Array<Int> = Array(4){0}
    var arrayStr =Array<String>(4){""}

   // for (element in arrayStr)
    for (index in 0..3)
    {
        arrayStr[index] = readln()!!
    }
    for (element in arrayStr){
        println (element)

    }
    for (index in 0..3)
    {
        println(" valaue at Index $index is: " + arrayStr[index])
    }

}