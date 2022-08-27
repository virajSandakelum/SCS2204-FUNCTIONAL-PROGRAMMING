object Q4 {

  def isEvenOdd(number:Int):Unit = number match {
    case 0 => println("Even Number")
    case 1 => println("Odd Number")
    case _ => isEvenOdd(number % 2)
  }


  def main(args: Array[String]): Unit = {

    print("Enter the number :")
    var number = scala.io.StdIn.readInt()
    isEvenOdd(number)
  }
}
