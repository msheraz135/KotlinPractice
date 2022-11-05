package LoopControl

fun main()
{
/*
    for (i in 100 downTo  0 step 5)
        println("level $i secured")
*/
    for (i in 1..3)
    {
        println("name: ")
        val name= readLine()!!.toString()
        println("live Place: ")
        val livePlace= readLine()!!.toString()

        println("Enter number of pets: ")
        val petCount= numberCheck(readLine()!!)
         if (petCount==0) {
             print("you entered 0 value cant coninue")
             break
         }
        var petName =""
        for (petId in 1..petCount)
        {
            println("Enter pet name for pet ID $petId: ")
            petName= petName+ readLine()!!.toString() + ", "

        }

        println("name is $name \nlive place is $livePlace\npet name are $petName \n")

        if (petName.contains("cat "))
           println("we are offering discount on cats ")


    }
}

fun numberCheck(toInt: String): Int {
        return try{
            toInt.toInt()

        }catch (ex: Exception){
            println("entered number is incorrect , try again")
            numberCheck(readln()!!)
        }
}
