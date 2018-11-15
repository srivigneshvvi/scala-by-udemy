
package recursive

import scala.annotation.tailrec
import scala.math.BigInt.int2bigInt
object anotherFact extends App {

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }
  println(anotherFactorial(600))
}