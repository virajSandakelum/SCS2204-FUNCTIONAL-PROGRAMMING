
object Question_3 {

  def volumeOfSphere(r:Double):Double = (4/3) * math.Pi * scala.math.pow(r,3)

  def main(args:Array[String]):Unit=
  {
     println(volumeOfSphere(5))


     print("Enter the radius of a sphere:")
     var radius = scala.io.StdIn.readDouble()
     println(volumeOfSphere(radius))
  }
}
