/**
  * Created by MacUser on 27/07/17.
  */


//Abstract class in scala is same as in Java. We should declare the class as abstract if it contains any method without implementation & assignment.
//Method which are defined without '=' & implementation part is called abstract Method. We don't need to define abstract keyword before the Method declaration.
//Method which have '=' without impelmenation is called concrete method.


abstract class Elements {

  def contents: Array[String]

  def width: Int = {
    if (height == 0) 0 else contents(0).length
  }

  def height: Int = contents.length

  def above(that: Elements): Elements = {Elements.this}

  def beside(that: Elements): Elements = {Elements.this}

  def showContents() =  this.contents.foreach(println)
}

//All the members from superClass can be inhertied/reused to subclass until if we have 2 exceptions.
//If the Member is private to super class.
//Member in super class having same name & parameters will not be implemented if the subclass having the same method with parameter

class ArrayElement(override val contents: Array[String]) extends Elements {

  override def above(that: Elements): Elements = {
    new ArrayElement(this.contents ++ that.contents)
  }

}





object testAbstract {
  def main(args: Array[String]): Unit = {

    def inverse(x : Int) = {
      assume(x!=0,"X should not be equal to 0")
      1/x
    }

    println(inverse(10))

    val arrayStringValue : Array[String] = Array("Value1","Value2","Value3")

    val firstArrayStringValue : Array[String] = Array("Value1")
    val secondArrayStringValue : Array[String] = Array("Value2333")


    val arrayElement : Elements = new ArrayElement(firstArrayStringValue)
    val arrayElement2 : Elements = new ArrayElement(secondArrayStringValue)

    (arrayElement above arrayElement2).showContents()

//    println("Height of the Array List :"+arrayElement.height)
//    println("Width of the first Array Element is :"+arrayElement.width)

  }
}
