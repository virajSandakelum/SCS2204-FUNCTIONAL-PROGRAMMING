object Practical_6 {

  def encryption(plainText:String,numOfShift:Int):Any = {

    val encryptedPlainText = new StringBuilder("")

    for(i <- 0 until plainText.length)
    {
      if(plainText(i).isWhitespace)
      {
        encryptedPlainText += ' '
      }

      if(plainText(i).isUpper)
      {
        val ASCIIValueOfLetter = plainText(i).toInt
        val currentIndexNum = ASCIIValueOfLetter - 65
        val shiftingTime = (currentIndexNum + numOfShift) % 26
        val encryptedLetter = (65 + shiftingTime).toChar
        encryptedPlainText += encryptedLetter
      }

      if(plainText(i).isLower)
      {
        val ASCIIValueOfLetter = plainText(i).toInt
        val currentIndexNum = ASCIIValueOfLetter - 97
        val shiftingTime = (currentIndexNum + numOfShift) % 26
        val encryptedLetter = (97 + shiftingTime).toChar
        encryptedPlainText += encryptedLetter
      }
    }

    println(encryptedPlainText)
  }


  def decryption(encryptedPlainText:String,numOfShift:Int):Any = {

    val decryptedPlainText = new StringBuilder("")


    for(i <- 0 until encryptedPlainText.length)
    {
      if(encryptedPlainText(i).isWhitespace)
      {
        decryptedPlainText += ' '
      }

      if(encryptedPlainText(i).isUpper)
      {
        val ASCIIValueOfLetter = encryptedPlainText(i).toInt
        val currentIndexNum = ASCIIValueOfLetter - 65
        val shiftingTime = (currentIndexNum - numOfShift + 26) % 26
        val encryptedLetter = (65 + shiftingTime).toChar
        decryptedPlainText += encryptedLetter
      }

      if(encryptedPlainText(i).isLower)
      {
        val ASCIIValueOfLetter = encryptedPlainText(i).toInt
        val currentIndexNum = ASCIIValueOfLetter - 97
        val shiftingTime = (currentIndexNum - numOfShift + 26) % 26
        val encryptedLetter = (97 + shiftingTime).toChar
        decryptedPlainText += encryptedLetter
      }
    }

    println(decryptedPlainText)

  }


  def main(args: Array[String]): Unit = {

    encryption("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",23)
    decryption("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD",23)

    encryption("viraj",5)
    decryption("anwfo",5)

  }
}
