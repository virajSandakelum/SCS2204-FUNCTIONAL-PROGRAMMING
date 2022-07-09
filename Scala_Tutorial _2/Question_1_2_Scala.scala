object Question_1_2_Scala {
  def main(args: Array[String]): Unit = {
    var k,i,j:Int= 2
    var m,n:Int = 5
    var f:Float = 12.0f
    var g:Float = 4.0f
    var c:Char = 'X'

    println("K + 12 * m = "+ (k + 12 * m))
    println("m / j = "+ (m / j))
    println("n % j = "+ (n % j))
    println("m / j * j = "+ (m / j * j))
    println("f + 10 * 5 + g = "+ (f + 10 * 5 + g))
    println("++i * n = "+ (prefixIncrement(i) * n))

  }

  def prefixIncrement(value:Int):Int=
  {
      value + 1
  }

}
