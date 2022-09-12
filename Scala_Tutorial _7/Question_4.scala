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



object Question_4 extends App {

  var bank:List[bankAccount] = List(new bankAccount("U001", 1000), new bankAccount("U002", 2000), new bankAccount("U003", -100), new bankAccount("U004",-200))


  val negativeBalanceAccount = (bank:List[bankAccount]) => bank.filter(account => account.accountBalance < 0.0)


  val sumOfAccountBalance = (bank:List[bankAccount]) => bank.map(listOfAccount => listOfAccount.accountBalance).reduce((total, listOfAccount) => total + listOfAccount)


  val interestAddToAccount = (bank:List[bankAccount]) => bank.foreach(aAccount =>{

        if(aAccount.accountBalance > 0.0 )
          aAccount.accountBalance += aAccount.accountBalance * 0.05
        else
          aAccount.accountBalance += aAccount.accountBalance * 0.1

  })


  interestAddToAccount(bank);

  println(negativeBalanceAccount)
  println(sumOfAccountBalance)
  println(bank);

}


