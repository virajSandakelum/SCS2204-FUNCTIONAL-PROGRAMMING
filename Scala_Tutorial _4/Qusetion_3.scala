object Qusetion_5 extends App {

  def toUpper(string: String): String = string.toUpperCase()

  def toLower(string: String):String = string.toLowerCase()


  def formatNames(name: String)(fMethod:(String) => String): String =
  {
      fMethod(name)
  }

  print(formatNames("Benny")(toUpper(_)))

}

