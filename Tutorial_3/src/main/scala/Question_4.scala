object Question_4 {

    def priceForAllBooks(numberOfCopies:Int):Double = 24.95 * numberOfCopies

    def getDiscount(totalBookPrice:Int):Double = totalBookPrice * 0.3

    def shipCost(numberOfCopies:Int):Double= numberOfCopies match {
      case x if x > 50 => 50 * 3 + (x-50) * 0.75
      case x if x <= 50 => numberOfCopies * 3
    }

    def totalWholesaleCost(numberOfCopies:Int):Double=
    {
      priceForAllBooks(numberOfCopies) + shipCost(numberOfCopies) - getDiscount(numberOfCopies)
    }


    def main(args:Array[String]):Unit=
    {
      println(totalWholesaleCost(60))


      print("Enter the total amount of books :")
      val numberOfBook = scala.io.StdIn.readInt()
      println("Total wholesale cost for book copies:" + totalWholesaleCost(numberOfBook) )
    }

}
