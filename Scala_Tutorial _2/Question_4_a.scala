object Question_4_a {
  def main(args: Array[String]): Unit = {

    def normalEarn(normalHours:Int):Int = normalHours * 250

    def OTearn(OThour:Int):Int = OThour * 85

    def salaryWithoutTax(normalHours:Int,OThour:Int):Int= normalEarn(normalHours) + OTearn(OThour)


    def tax(salaryWithoutTax:Int): Double =
    {
      salaryWithoutTax * 0.12
    }

    def netSalary(normalHours:Int,OThours:Int):Double=
    {
      salaryWithoutTax(normalHours,OThours) - tax(salaryWithoutTax(normalHours,OThours))
    }

    println()
    print("Enter the Employee Working Hours:")
    var normalHours = scala.io.StdIn.readInt()
    print("Enter the Employee OT Hours:")
    var OThours = scala.io.StdIn.readInt()

    println("Net salary of Employee :"+netSalary(normalHours, OThours))

  }
}
