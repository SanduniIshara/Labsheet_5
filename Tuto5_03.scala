object Tuto5_03{
  def main(args: Array[String]): Unit = {
    println("Enter a number that you want get sum:")
    val number=scala.io.StdIn.readInt();
    val result=sum(number)
    println(result)
  }
  def sum(n:Int):Int={
    if(n<=0)
      0
    else
      n+sum(n-1)
  }
}

