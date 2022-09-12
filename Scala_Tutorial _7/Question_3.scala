class bankAccount(a:String,b:Double)
{
    val accountNumber:String = a
    var accountBalance:Double = b

    def transfer(transferAccount:bankAccount,amount:Double):Unit = {
        if(accountBalance < amount)
            println("\nInsufficient Account Balance")
        else{
            this.accountBalance = this.accountBalance - amount
            transferAccount.accountBalance = transferAccount.accountBalance + amount
        }
    }

    override def toString: String = accountNumber + " account balance is " + accountBalance

}

object Question_3 extends App {
    println()

    val user1 = new bankAccount("U001",1000.23)
    val user2 = new bankAccount("U002",500.56)

    println(user1)
    println(user2)

    user1.transfer(user2,200.29)
    println()

    println(user1)
    println(user2)
}






