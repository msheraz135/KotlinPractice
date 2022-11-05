package CollectionAndStrings

fun main()
{
    //no repeatation in set
    //set is immutable cant be updated
    var set= setOf(1,2,3,4,5,6,7)

    var setMutable = mutableSetOf(1,2,3,4,5,6,7,8)
    setMutable.add(9)
    for(element in setMutable)
    {
        println(element)
    }
}