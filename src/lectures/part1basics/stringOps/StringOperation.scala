package stringOps

object StringOperation extends App{
 /*java func available in scala*/
  val str:String= "Hi I am Scala"
  println(str.charAt(0))
  println(str.subSequence(5,7))
  println(str.split(" ").toList)
  println(str.startsWith("Hi"))//returns boolean 
  println(str.replace(" ","_"))
  println(str.toLowerCase())
  println(str.length())  //withparams
  println(str.length)//without params
  
  /* */
  val aNumberString="45"
  val aNumber=aNumberString.toInt //converted to int
  
  /* prepending and appending*/
  println('a' + aNumberString + 'z')
  println(str.reverse)
  println(str.take(2))
  
  /*scala specific : string interpolators*/
  
  //s-interpolators
  val name="David"
  val age=12
  //$means val
  val greeting= s"Hello, many name is $name and  i am $age"
  val anotherGreeting= s"Hello, many name is $name and  i am ${age +44}  years old"
  
  println(greeting)
  println(anotherGreeting)
  
  //F-interpolators
  
  val speed =50.5f
  
  val myth =f"$name can eat $speed%2.4f burgers per minute"   //%2.2 means 2 numers and 4 decimal
  println(myth)
  
  // val x=1.1f
  // val str =f"$x%3d"   //throws compile error 
  
  /*raw- interpolator*/
  
  println("1.this line \n2.print in diffrent line")
  println(raw"3.this line \n4.print in same line")
  
  val escaped ="this line with \n will escape to new line when printed"
  println(raw"$escaped")
  
  
}