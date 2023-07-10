object Tuto5_06 {
  def main(args: Array[String]): Unit = {

    def fibonacci(number: Int): Int = number match {
      case number if (number<=1) => number
      case _ => fibonacci(number - 1) + fibonacci(number - 2)
    }

    def fibonacciSequence(number: Int): Unit = {
      if (number >= 0) {
        fibonacciSequence(number - 1)
        println(fibonacci(number))
      }
    }

    println("Enter the number:")
    val number = scala.io.StdIn.readInt();
    val result = fibonacciSequence(number)
    println(result)

  }
}
