package recursive

object MainObject {
  def main(args: Array[String]) = {  
        var result = functionExample(15,2)   
        println(result)  
    }  
    def functionExample(a:Int, b:Int):Int = {  
        if(b == 0)        {  // Base condition  
         println("a="+a)
          println("0")
          0  
        }
        else{  
          println("a="+a+" b="+b)
         a+functionExample(a,b-1)
         }  
    }  
}