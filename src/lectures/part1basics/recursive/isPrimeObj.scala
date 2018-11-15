package recursive

import scala.annotation.tailrec


object isPrimeObj extends App{
  def isPrime(n:Int):Boolean={
    @tailrec
    def isPrimeTailrec(t:Int,isStillPrime:Boolean):Boolean=
      if(!isStillPrime) false
      else if (t<=1) true
      else isPrimeTailrec(t-1,n%t!=0 &&  isStillPrime)
  isPrimeTailrec(n/2,true)      
  }
  println(isPrime(3))
}