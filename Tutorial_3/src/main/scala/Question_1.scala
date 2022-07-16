object Question_1 {

  def areaOfDisk(r:Double): Double =
  {
      math.Pi * r * r
  }

  def main(args: Array[String]): Unit = {

      println("The area of a disk with radius 5 :" + areaOfDisk(5))

      print("Enter the radius of the Disk:")
      val radius = scala.io.StdIn.readFloat()
      println("The area of a disk with radius "+ radius + " :" + areaOfDisk(radius))
  }
}
