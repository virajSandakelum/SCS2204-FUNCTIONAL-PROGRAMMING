
object Question_4_b {

  def main(args: Array[String]): Unit = {

    def attendance(ticketPrice:Int):Int= ticketPrice match
    {
        case x if x > 15 && x > 0 =>
          if((120 + (-20/5) * (x - 15)) > 0)
              (120 + (-20/5) * (x - 15))
          else
              0

        case x if x < 15 && x > 0 =>
          if(120 + (20/5) * (15 - x) > 0)
              120 + (20/5) * (15 - x)
          else
              0

        case x if x == 15 => 120
    }


    def ticketRevenue(ticketPrice:Int):Int=
    {
        ticketPrice * attendance(ticketPrice)
    }


    def ownerCost(ticketPrice:Int):Int=
    {
        500 + 3 * attendance(ticketPrice)
    }


    def netProfit(ticketPrice:Int):Int=
    {
        ticketRevenue(ticketPrice) - ownerCost(ticketPrice)
    }


    var profitCompareMap = Map[Int,Int]()
    var i = 1
    while(i > 0)
      {
        print("Enter the ticket price :")
        var ticketPrice = scala.io.StdIn.readInt()
        var profit = netProfit(ticketPrice)
        profitCompareMap += ticketPrice->profit

        profitCompareMap.keys.foreach{ i=>
          println("Ticket Price Rs."+i+"  =>  "+"Profit Rs."+profitCompareMap(i))
        }

        println("Best Ticket Price is :Rs."+profitCompareMap.maxBy(_._2))

        println()
      }
  }
}
