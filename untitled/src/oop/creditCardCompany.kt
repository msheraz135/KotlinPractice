package oop

import oop.CreditCard as CreditCard

interface CreditCard {
    val cardNumber:String
    fun score(age:Int)
}

class masterCard(override val cardNumber: String) : CreditCard {

        override fun score(age: Int) {
            if (age>59)
            {
            println("negative")
            }
            else
            {
                println("psoitive")
            }
        }

     }


class Vise(override val cardNumber: String) : CreditCard {

    override fun score(age: Int) {
        if (age > 60) {
            println("neagtive")
        } else {
            println("positive")
        }

    }
}



 class paypayl(client : CreditCard) :CreditCard by client{
     //print card number here
 }

fun main()
{
    val vise=Vise("454564645465465465")
    vise.score(50)


    val masterCard=masterCard("784564645465465465")
   vise.score(50)

    val paypayl=paypayl(masterCard)
    println(paypayl.cardNumber+": is card number of pay pall")
}
