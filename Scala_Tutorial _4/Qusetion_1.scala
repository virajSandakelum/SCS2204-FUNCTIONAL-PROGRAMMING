object Qusetion_1 extends App {

    def interest(depositAmount:Int):Double = depositAmount match {
        case x if(x > 0 && x <= 20000 ) => x * 0.02
        case x if(x <= 200000) => x * 0.04
        case x if(x <= 2000000) => x * 0.035
        case x if(x > 2000000) => x * 0.065
    }

    print("\nEnter the Deposit Amount :")
    var depositAmount = scala.io.StdIn.readInt()
    println("if amount is Rs."+ depositAmount+" then interest is: Rs:"+interest(depositAmount))


}
