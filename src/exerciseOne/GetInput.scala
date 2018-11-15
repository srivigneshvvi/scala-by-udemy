package exerciseOne

object GetInput extends App{
  
  
  println("Enter the no of add arguments")
   var noOfArgs=scala.io.StdIn.readLine().toInt
   println("noOfArgs--> "+noOfArgs)
    println("Enter the no of add arguments")

     var numArr = new Array[Int](0)
for(count<-0 to noOfArgs-1){
   var intValue=scala.io.StdIn.readLine().toInt
  numArr=numArr:+intValue
}
  println("numArr   "+numArr.toList)
  var col  = List[Int]()
 
  def createList(a:Int,listval:List[Int]){  
    listval.toList
  }
}