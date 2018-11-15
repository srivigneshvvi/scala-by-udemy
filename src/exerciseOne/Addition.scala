package exerciseOne

object Addition extends App{
  
//  def add(num:Integer,times:):Integer={
// num+accumulator
//  }
  
  def add(num : Integer , numTwo:Integer,ans: Integer=0,accumulator:Integer=1):Integer={
println("num "+num +"numTwo  "+ numTwo+"  ans "+ans+ " acc "+accumulator)
    if(accumulator==0) 
      ans
    else {
      add(num,numTwo-1,ans+num,numTwo-1)
      }  
  }
  
  //println(add(2,3));
//  println(mul(5, 4))
  println("Enter no \n 1)add \n 2) mull");
  
 var option= scala.io.StdIn.readLine().toInt
 if(option==1){
  println("Enter the no of add arguments")
   var listofvalues=scala.io.StdIn.readLine().toInt
   
   
   println(listofvalues)
 }else {
  println("Enter the no of mull arguments") 
 }
  def mul(numOne:Integer,numTwo:Integer):Integer={
    add(numOne,numTwo)
  }
  
}