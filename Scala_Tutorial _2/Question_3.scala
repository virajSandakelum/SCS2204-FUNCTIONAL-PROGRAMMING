object Question_3 {
  def main(args: Array[String]): Unit = {
    var a:Int=2
    var b:Int = 3
    var c:Int = 4
    var d:Int = 5
    var g = 4.0f
    var k = 4.3f

    println( "--b*a+c*d-- :" + prefixDecrement(b) * a + c *postfixDecrement(d))
    println("a++ :" + postfixIncrement(a))
    println("(–2) * ( g – k ) +c :" + (-2) * (g-k) + c)
    println("c=c++ :" + postfixIncrement(c));
    println("c=++c*a++ :" + prefixIncrement(c)*postfixIncrement(a));


  def prefixIncrement(value:Int):Int = value + 1
  def prefixDecrement(value:Int):Int = value - 1

  def postfixDecrement(value:Int):Int = value
  def postfixIncrement(value:Int):Int = value

  }
}
