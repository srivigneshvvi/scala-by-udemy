package CallByNameAndCallByValue

object CBNvsCBV  extends App {
     
  def callByValue(x:Long){
  val s:String ="d"
  println()
    println("by value: "+x)//592259598976368
  println("by value: "+x)//592259598976368
  }
  
  def callByName(x: =>Long)
  {
  println("by name: "+x)//System.nanoTime()
  println("by name: "+x)//System.nanoTime()
  }
  
  println(System.nanoTime())
  println(callByValue(System.nanoTime()))
      println(callByName(System.nanoTime()))
      
      val s:String ="d"*1000
  println(s)
}