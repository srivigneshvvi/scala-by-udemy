

object First extends App{
  def success(){
    var x="Hello World"
    println("return Unit that is ()")
    x
  }
   def successReturnsString()={
    var x="Hello successReturnsString World"
  //  x=1
   // var y=1
//    y
  }
 val result= success
 
 println(result)
 println(successReturnsString)
}