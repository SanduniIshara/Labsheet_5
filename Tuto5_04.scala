object Tuto5_04 {
  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val number = scala.io.StdIn.readInt();
    val result = even(number)
    println(result)
  }
  def even(n:Int):String={
    if(n==0)
      "Even"
    else if(n==1)
      "Odd"
    else
      even(n-2)
  }
}
