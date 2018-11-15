package lectures.part2oop

object OOBasics extends App{
  val person =new Person ("ram",55)
  
  println(person.age)
  //person.greet("vignesh")
  person.getClass()
  
}


//constructor
class Person (name: String ,val  age:Int ){
  //body
  val x=2
  println(1+3)
  //method
  def greet (name:String ):Unit=println(s"${this.name} says :Hi,  $name");
  
  //overloading
  def greet():Unit=println(s"Hi,  I am $name")
  
  //multiple Constructors
  def this(name:String)=this(name,0)
}

//class parameters are NOT FIELDS