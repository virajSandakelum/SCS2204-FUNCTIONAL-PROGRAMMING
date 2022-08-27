object Q6 {

  def fibonacci(n:Int):Int = n match {
    case x if(x == 0 || x == 1) => return n
    case _ => fibonacci(n-1) + fibonacci(n-2)
  }

  def fibonacciSeq(n:Int):Unit ={
    if(n > 0)
      fibonacciSeq(n-1)
    print(fibonacci(n) + "  ")

  }

  def main(args: Array[String]): Unit = {

    print("Enter the value of n :")
    var n = scala.io.StdIn.readInt()
    fibonacciSeq(n)
  }
}
