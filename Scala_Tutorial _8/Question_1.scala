case class Point(var x:Int,var y:Int){

//  add two given points
  def +(givenPoint:Point):Point = {
      Point(this.x + givenPoint.x, this.y + givenPoint.y)
  }

//  move Point
  def move(dx:Int,dy:Int): Unit ={
      this.x +=  dx
      this.y +=  dy
  }

//  distance of 2 Points = sqrt{(x2-x1)^2 + (y2-y1)^2}
//  distance of Two Point
  def distance(givenPoint:Point):Double = {
      Math.sqrt(Math.pow(this.x-givenPoint.x,2) + Math.pow(this.y-givenPoint.y,2))
  }

//  switch the x and y coordinates
  def invert():Unit = {
      val temp = this.x
      this.x = this.y
      this.y = temp
  }

}

object Question_1 extends App {
  println()

  var point1:Point = Point(1,2)
  var point2:Point = Point(3,4)
  println("Point1 is :" + point1)
  println("Point2 is :" + point2)

  var point3:Point = point1 + point2
  println("Adding 2 points: "+ (point1 + point2))

  point1.move(2,2)
  println("Point1 move toward to Point2: " + point1)

  var distance:Double = point1.distance(point2)
  println("Distance of Point1 and Point2: " + distance)

  point1.invert()
  println("Invert of the Point1: " + point1)


}
