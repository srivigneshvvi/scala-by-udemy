package exerciseOne

import scala.annotation.tailrec

object exOneforaddition extends App {
  var intListTwo = List(1, 5, 7)

  def add(ans: Int, b: Int): Int = {
    println("a= "+ans+" b="+b)
    ans + b
  }
  def mul(firstArg: Int, secArg: Int, acc: Int = 0): Int = {
    @tailrec
    def mulbyrec(firstArg: Int, secArg: Int, acc: Int, acc2: Int): Int =
    if (acc == 0) acc else mulbyrec(add(firstArg, secArg), secArg = secArg, acc - 1, acc2 = add(firstArg, secArg))

    mulbyrec(firstArg, secArg, acc = secArg, acc2 = secArg)
  }

  def intListTwoFun = intListTwo.reduce((x, y) => mul(x, y))
  println(intListTwoFun)

  //  def mul(firstArg: Int, secArg: Int,acc:Int=0): Int = {
  //    println("firstArg= "+firstArg+"  secArg=="+secArg+" acc=="+acc)
  //   @tailrec
  //    def mulbyrec(firstArg:Int,secArg:Int,acc:Int,acc2:Int):Int ={
  //    println("mulrec  firstArg= "+firstArg+"  secArg=="+secArg+" acc=="+acc+" acc2"+acc2)
  //    //if(acc2==0) acc  else mulbyrec(firstArg,secArg ,acc= add(firstArg,secArg),acc2=acc-1)
  //    if(acc==0) acc  else mulbyrec(add(firstArg,secArg),secArg=secArg,acc-1,acc2=add(firstArg,secArg))
  //    }
}