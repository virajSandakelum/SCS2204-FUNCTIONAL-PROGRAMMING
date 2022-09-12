class Rational1(n:Int, d:Int) {
  require(denom > 0, "Denominator must be greater than 0")

  def numer:Int = n

  def denom:Int = d

  def add(r:Rational1): Rational1 = {
    new Rational1(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
  }


  def neg = new Rational1(-this.numer, this.denom)

  override def toString(): String = numer + "/" + denom

}

object Question_1 extends App {

  val obj1 = new Rational1(1,2)
  val obj2 = new Rational1(4,5)
  println(obj1.neg)
  println(obj1)

  val q = obj1.add(obj2)
  println(q)

}

