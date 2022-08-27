object Q5 {

  def isEven(number:Int):Boolean = number match {
    case 0 => true
    case 1 => false
    case _ => isEven(number % 2)
  }


  def additionOfEvenNumber(n:Int,i:Int = 1):Int = i match{

    case i if(i == n) => return 0
    case i if(isEven(i)) => i + additionOfEvenNumber(n,i+1)
    case _ => additionOfEvenNumber(n,i+1)
  }

  def main(args: Array[String]): Unit = {

    print("Enter the value of n :")
    var n = scala.io.StdIn.readInt()
    println(additionOfEvenNumber(n))
  }
}
