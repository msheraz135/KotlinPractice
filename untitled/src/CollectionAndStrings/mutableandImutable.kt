package CollectionAndStrings

fun main(){
    var map= hashMapOf(1 to "hussain", 2 to "jena")
    map.put(3,"ali")
    println(map.get(3))
    println(map[2])

    //array of
    var arr= arrayOf(1,2,3,4,5,6)
    println(arr[0])

    var list = listOf(11,22,33,44) //immutable
    var listMutable = mutableListOf(11,22,33,44)
    listMutable[0]=55
    for(item in listMutable)
    {
        println(item)

    }

}