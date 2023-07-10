object Tuto5_01 {
  def main(args: Array[String]): Unit = {

        println("Enter a number:");
        val number = scala.io.StdIn.readInt()
        val result = prime(number)
        println(result);
      }

      def prime(n: Int, i: Int = 2): Boolean =i match {
        case number if (n <= 2)=> n==2
        case number if (n % i==0)=> false
        case number if (i*i>n)=> true
        case _=>prime(n, i + 1)

      }




}
