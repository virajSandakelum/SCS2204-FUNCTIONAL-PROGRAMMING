object Q1 {

  def prime(n:Int, i:Int = 2): Boolean = n match {
    case x if(x < i ) => false
    case x if(i == x) => true
    case x if(x % i == 0) => false
    case _ => prime(n,i+1)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the value of n :")
    var n = scala.io.StdIn.readInt()
    println(prime(n))
  }
}


//def GCD(num1:Int,num2:Int):Int = {
//
//    if(num1 == 0)
//      return num2
//    if(num2 == 0)
//      return num1
//
//    if(num1 > num2)
//      return GCD(num1%num2,num2)
//    else
//      return GCD(num1,num2%num1)
//  }

//  def prime(n:Int, i:Int = 2): Unit = {
//    if(n == i)  println("jjjjj")
//    else if(n % i == 0)  println(i)
//    else  prime(n,i+1)
//  }