package forloop

object screat {
  def main(args : Array[String]){
    var numgesss=0
    
    do{
      println("Enter the Number u guessed : ")
      numgesss=readLine().toInt
    }while(numgesss!=10)
    
      println("Success u guess")
  }
}