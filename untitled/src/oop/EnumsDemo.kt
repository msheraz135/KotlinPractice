package oop

class EnumsDemo {

}
enum class Direction{
      NORTH,SOUTH,EAST,WEST
}

fun main(args:Array<String>) {
var userDirect=Direction.SOUTH
    if(userDirect==Direction.EAST)
    {
        println("he wnt to east")
    }
    else{
        println("i dont know where he went ")
    }
    
}