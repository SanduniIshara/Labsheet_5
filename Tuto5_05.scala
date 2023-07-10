object Tuto5_05 {
  def main(args: Array[String]): Unit = {
    println("Enter the number:")
    val number = scala.io.StdIn.readInt();
    val result = sumEven(number)
    println(result)
  }

  def sumEven(n: Int): Int = {
    if (n <= 0)
      0
    else if (n % 2 == 0)
      n + sumEven(n - 2)
    else
      sumEven(n - 1)
  }


}
