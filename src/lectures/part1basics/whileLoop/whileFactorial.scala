package whileLoop

object whileFactorial {
  
  def main(args: Array[String]){
    var fact =1;
    
    var num=4
    
    while(num>0){
      fact=fact*num
      num=num-1      
    }
    println("Factorial :  "+fact)
  }
}