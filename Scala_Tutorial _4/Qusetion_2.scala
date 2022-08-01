object Qusetion_4 extends App {

    def checkEvenOdd(inputValue:Int):Any = inputValue match {
        case x if(x == 0) => println("Zero")
        case x if(x <= 0) => println("Negative Number")
        case x if(x % 2 == 0) => println("Even Number")
        case x if(x % 2 == 1) => println("Odd Number")
    }


    print("Enter the integer value: ")
    var inputInteger = scala.io.StdIn.readInt()
    print("Input integer value is "+inputInteger+" and it is ")
    checkEvenOdd(inputInteger)
}
