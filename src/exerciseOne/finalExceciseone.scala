package exerciseOne

object finalExceciseone {
  def mul(firstArg: Int, secArg: Int): Int = {
    add(firstArg, secArg)
  }

  def add(ans: Int, b: Int): Int = {
    if (b == 0) 0
    else
      ans + add(ans, b - 1)
  }
  def addList(intListTwo: Array[Int]) = intListTwo.reduce((x, y) => add(x,y))

  def multiplication(intListTwo: Array[Int]) = intListTwo.reduce((x, y) => mul(x, y))
  def noOfArgs(): Int = {
    println("Enter the no of add arguments")
    var noOfArgs = scala.io.StdIn.readLine().toInt
    noOfArgs.toInt
  }

  def getvaluesInList(noOfArgs: Int): Array[Int] = {
    var numArr = new Array[Int](0)
    for (count <- 0 to noOfArgs - 1) {
      var intValue = scala.io.StdIn.readLine().toInt
      numArr = numArr :+ intValue
      println("numARR " + numArr.toList)
    }
    numArr.toArray
  }
  def main(args: Array[String]) = {
    println("Enter no \n 1)add \n 2) mull");

    var option = scala.io.StdIn.readLine().toInt
    if (option == 1) {
      println(addList(getvaluesInList(noOfArgs)))
    } else {
      println(multiplication(getvaluesInList(noOfArgs())))
    }

    //println("Hello Scala")
  }

}