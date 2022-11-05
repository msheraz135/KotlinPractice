package LoopControl

fun main()
{
    println("break inner exapmple")
    loop@ for (n in 1..10)
    {
        println("number: $n")
      for (innerloop in 1..7) {
            println("innerloop: $innerloop")
            if (innerloop==6) {
                break@loop
            }
        }
    }
}