class Rational(n:Int, d:Int) {

  def numer:Int = n
  def denom:Int = d
  
  def neg:Rational = new Rational(-this.numer, this.denom)
  def add(r:Rational):Rational = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
  def -(r:Rational):Rational = this.add(r.neg)

  override def toString: String = numer + "/" + denom
}


object Question_2 extends App {

  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  val answer = x-y-z

  println(answer)
}



