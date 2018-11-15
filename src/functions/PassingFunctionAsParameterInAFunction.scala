package functions

object PassingFunctionAsParameterInAFunction {
   def main(args: Array[String]) = {  
     functionExample(25, multiplyBy2)                   // Passing a function as parameter  
    }  
    def functionExample(a:Int, f:Int=>AnyVal):Unit = {
      println(f)
      println("a funcEXaml="+a)
      
      
        println(f(6))                                   // Calling that function   
    }  
    def multiplyBy2(a:Int):Int = {  
      println("a="+a+" (a*2)= "+a*2)
        a*2  
    } 
}