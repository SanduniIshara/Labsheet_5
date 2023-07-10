object Tuto5_02 {
  def main(args: Array[String]): Unit = {
    println("Enter a number :");
    val number=scala.io.StdIn.readInt();
    val result=primeSeq(number)
    println(result);
  }
  def primeSeq(n:Int, i:Int=2):Unit={
    if(i<n){
      if(isPrime(i))
        println(i)
      primeSeq(n,i+1)
    }
  }
  def isPrime(n:Int, i:Int=2):Boolean= i match{
    case number if (n <= 2) => n == 2
    case number if (n % i == 0) => false
    case number if (i * i > n) => true
    case _ => isPrime (n, i + 1);
  }

}
