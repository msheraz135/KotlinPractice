package CollectionAndStrings

import java.util.LinkedList


fun main()
{

    var userPetsMap = HashMap<String,LinkedList<String>>()

    for (i in 1..2)
    {
        println("user name: ")
        val name= readLine()!!.toString()
        println("live Place: ")
        val livePlace= readLine()!!.toString()

        var  petList = LinkedList<String>()
        do{
            println("Enter names of pets: ")
            var petName = readLine()!!.toString()
                if (petName != "next" && petName !="")
                    petList.add(petName)

        }while(petName != "next")
         userPetsMap["$name;$livePlace"] = petList

        println("user name is $name \nlive place is $livePlace\n")


    }
    for (key in userPetsMap.keys)
    {
        println("key Name and live place is: $key")

        for (petNameInkey in userPetsMap[key]!!)
        {
            println("pet names are: $petNameInkey")

        }
        if (userPetsMap[key]!!.contains("cat "))
            println("we are offering discount on cats ")

    }
}


