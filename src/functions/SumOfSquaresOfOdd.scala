package functions

object SumOfSquaresOfOdd {
  def main(args:Array[String]):Unit =
        {
                var intList = List(1,2,3,4,5)
                var intListTwo = List(1,2,3,4,5,1)
                def sum = intList.filter(x => x % 2 ==1).map(x => x * x ).reduce((x,y) => x+y) //operates on all the list value
            //    def sum = intList.filter(x => x % 2 ==1)   //List(1, 3, 5)
            //    def sum = intList.filter(x => x % 2 ==1).map(x => x * x )//List(1, 9, 25)
                def sss(a:Int,b:Int):Int= {a+b}
                def add=intListTwo.reduce((x,y)=> sss(x,y))
                println(add)
                println(sum)
        }
}