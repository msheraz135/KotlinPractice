package DecisionMaking

fun main( args:Array<String>)
{
/*    print(3>0 && 3<6)
    print(3<5  || 3<2)
    print(3==5)
    print(3!=5)*/

// not gate
/*    var ismarried = true
    println("\n"+!ismarried)*/

//simpleif

 /*   println("    enter your grade\n: ")
    var grade= readLine()!!.toInt()

    if (grade>=90)
    {
        grade++
        println("level A secured")
    }
    else if (grade<90 && grade >=80)
    {
        println("level B secured")
    }
    else if(grade in 70..79)
    {
        println("level c secured")
    }
    else
        println("fail, your level is not secured")


    println("your grade is $grade")*/

//    when
// nested_if

    println("    enter your grade\n: ")
    var grade= readLine()!!.toInt()
    when
    {
        grade >= 90 -> if(grade in 95..100)
            println("level A+ secured")
        else
            println("level A secured")

        grade in 80..89 -> if(grade in 85..100)
            println("level B+ secured")
        else
            println("level B secured")

        grade in 70..79 -> println("level c secured")

        grade in 65..69 -> println(" dangerzone")

        else -> println("fail")
    }
    val isMaried=true
    val Gpa =3.8
    val isqualified = if (isMaried && Gpa>=3.8) 1 else 0
    println(isqualified)

    val isGood=when(Gpa){4.0 -> true else->false }
    println(isGood)

}