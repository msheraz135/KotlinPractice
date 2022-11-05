package CollectionAndStrings

fun main(args:Array<String>)
{
 /*   var arrayList=ArrayList<String>()
   //.add
    //.get
    var check = arrayList.contains("hussain")
    var int = arrayList.size-1
*/
  var map = HashMap<Int,String>()
    map.put(1,"jjh")
    map.put(2,"sds")
    map[123]="hassan"


    for(key in map.keys)
    {
        println("$key: ${map[key]}")
    }
}