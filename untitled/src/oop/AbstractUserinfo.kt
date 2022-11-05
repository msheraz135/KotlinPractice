package oop
abstract class creditCard(){
    fun creditId():String{
        return "4545ddd555"
    }
    abstract fun newCredit()
}
 class AbstractUserinfo:creditCard() {

     fun CreditId():String{
         return creditId()
     }
     override fun newCredit()
     {
         println("new card created")
     }
}



fun main(args:Array<String>)
{
    var user = AbstractUserinfo()
    println("cId is: " + user.creditId())
    user.newCredit()
}