object Question_5 {

    def easyPaceTime(kilometer:Int):Int=
    {
        kilometer * 8
    }

    def tempoTime(kilometer:Int):Int=
    {
        kilometer * 7
    }

    def main(args:Array[String]):Unit=
    {
         val totalRunningTime = easyPaceTime(2) + tempoTime(3) + easyPaceTime(2)
         println("Total Running Time :"+totalRunningTime)
    }
}
