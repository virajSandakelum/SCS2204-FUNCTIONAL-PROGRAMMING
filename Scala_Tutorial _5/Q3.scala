object Q3 {

  def sum(n:Int): Int = n match {
    case x if(x == 1) => return 1
    case _ => n + sum(n-1)
  }


  def main(args: Array[String]): Unit = {
    print("Enter the value of n :")
    var n = scala.io.StdIn.readInt()
    println(sum(n))
  }
}
