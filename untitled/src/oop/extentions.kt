package oop

class extentions {
}

fun ArrayList<Int>.findmax():Int
{
    var max=0

    for (element in this)
    {
        if (element > max)
        {
            max= element
        }
    }
    return max
}
fun main()
{
    var arrayList= ArrayList<Int>();
    arrayList.add(55)
    arrayList.add(54)
    arrayList.add(8)
    arrayList.add(7)
    arrayList.add(5)

 println(arrayList.findmax())
}