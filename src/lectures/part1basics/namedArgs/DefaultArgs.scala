package namedArgs

object DefaultArgs extends App{
  
  def trFact(n:Int,acc:Int=1):Int=///acc second agrumnt can take default  aggrument as 1
    if(n<=1) acc
    else trFact(n-1,n*acc)
    
    val fact10=trFact(3) ///acc second agrumnt can take default  aggrument as 1
    println("facv "+fact10)
    
    def savePicture(format:String ="jpg",width:Int=123,height:Int=1234):Unit = println("savin print")
    
    savePicture("d")// mentioning 
   // savePicture(3,3)// error 
     /* parameter can be given in any order with its name*/
    savePicture(format="png",width=2344,height=333)
}