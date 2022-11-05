

fun main(args: Array<String>)
{
    val number ="4545544"
    var number2 =""

    number2 = if(number.contains("-"))
    {
        number.drop(1)
    }
    else
    {
        "-$number"
    }

    println(number2)


/*    var check:Boolean=true

    while (check) {
    println("Enter two digits")
    print("enter 1st number; ")
    var n1: Float = readLine()!!.toFloat()
    println("enter 2nd number: ")
    var n2: Float = readLine()!!.toFloat()

            println("/n Enter operation u wana perform & T to terminate: ")

            var opr: String = readln()!!.toString()
            when (opr) {
                "+" -> println(" sum is ${n1 + n2}")
                "-" -> println(" difference is ${n1 - n2}")
                "t" -> check=false
            }

        *//*when (x) {
            is Int -> print(x + 1)
            is String -> print(x.length + 1)
            is IntArray -> print(x.sum())
        }*//*
        }*/
}