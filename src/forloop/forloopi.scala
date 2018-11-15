package forloop

object forloopi {
  def main(args : Array[String]){
    for(i<-11 to 20) // prints 11 to 20
      println(i)
    
      println("over")
      
    for(i<-11 to 20 by 2) // increment by 2
      println(i)   
      
      
       for(i<-10 to 5 by -2) // decrement by 2
      println(i)   
      
  }
}