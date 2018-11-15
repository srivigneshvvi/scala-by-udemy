//import scala.annotation.tailrec
//
//
//object Recursion extends App{
//
//
//   
//   def ConcatinateString(s:String,times:Int):String={
//    
//     s*times
//   }
//  //   println(ConcatinateString("Vignesh \n",20000))
////     
////     //println("Result "+factorial(1500))
//// //  println(unlimitedFactorial(1000))
//// 
//  def unlimitedFactorial(n: BigInt): BigInt ={
//        @tailrec
//    def anotherFact(x: BigInt,accmulator:BigInt):BigInt=
//   if(x<=1) accmulator
//   else  anotherFact(x-1 , x * accmulator)  //TAIL RECURSIVE // WITHOUT USING EXTRA STACK MEMORY
//   
//      anotherFact(n,1)
//      
//  }
//  ///WHEN YOU NEED LOOPS USE TAIL RECURSION
//   //STRING RESURSTION IN N TIMES TAIL RECURSION
//   //ISPRIME FUNCTION IN TAIL RECURSION
//   //FIBONACCI FUNCTION IN TAIL RECURSION
////  var n=10
////  def factorialInt(n:Int):Int={
////   
////    if(n<=0) 1
////    else
////      n * factorialInt(n-1)
////  }
////  println(factorialInt(3))
//   @tailrec
//  def factorial(n: BigInt): BigInt =
//    if (n <= 1)  1
//    else{
//      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
//    val result = n * factorial(n-1) 
//     println("Computed factorial of " + n) 
//    result
//    }
////   
//  
////  def isPrimeWithTailRecursive(n:Int ):Boolean=
////    return (n%2==0) ? true : false;
////  
//  
//}