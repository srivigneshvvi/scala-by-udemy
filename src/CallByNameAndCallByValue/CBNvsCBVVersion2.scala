package CallByNameAndCallByValue

object CBNvsCBVVersion2 extends App {
  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite(),33)//Error allByNameAndCallByValue.CBNvsCBVVersion2$.infinite(CBNvsCBVVersion2.scala:4)
  printFirst(33, infinite())  //33
}
