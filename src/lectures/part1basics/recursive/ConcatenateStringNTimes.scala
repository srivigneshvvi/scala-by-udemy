
package recursive

import scala.annotation.tailrec

object ConcatenateStringNTimes extends App{
    @tailrec
  def concatenatewithtailrecursive(conString :String ,times :Int ,accmulator :String ):String=
    if(times<=0) accmulator
    else concatenatewithtailrecursive(conString, times-1,conString+accmulator)
    
    println(concatenatewithtailrecursive("vignehs ",2,""))
  
}