import java.io.File

/**
  * Created by MacUser on 26/07/17.
  */
object FileMatching {

  private def fileList = new File("D:\\NaveenFiles\\Scala Programming\\Documentation\\Scala Programming\\scalaBasicTesting").listFiles()

  private val testList : List[Int]= List(1,2,5,3,4,56,7,78,7)
  def fileEnding(query : String) = {
    val fileEndingFnValue = (value1: String) => value1.endsWith(query)
    fileMatching(fileEndingFnValue)
  }

  def fileContaining(query : String) = {
    fileMatching(_.contains(query))
  }

  def fileMatching(matcher :(String) => Boolean) = {
    for(file <- fileList ; if matcher(file.getName))
      yield file
  }


  def containsImpertiveWay(findNum : Int) : Boolean = {
    var exist = false
    for(testNum <- testList) {
      if(testNum == findNum)
        exist = true
    }
    exist
  }

  def containsFunctionalWay(findNum : Int) : Boolean = testList.exists(_ == findNum)


  //Curried Function testing using functional Values

  def normalAdd(x : Int, y : Int) = x+y

  def curriedFunction(x : Int)(y : Int) = x+y

  def spiltCurriedFnValue(x:Int) = (y : Int) => x+y // If we call this method it will return the function value later it can be used to add the values x & y



}

object testFileMatching  {
  def main(args: Array[String]): Unit = {
    println("-----File Ending Method check-----")
    FileMatching.fileEnding(".scala").toList.foreach(f => println(f.getName))
    println("-----File Containing method check-----")
    FileMatching.fileContaining("java").toList.foreach(f => println(f.getName))
    println()
    println("Testing the Higher order functions exist method imperative way")
    println("3 exist in the list :"+FileMatching.containsImpertiveWay(3))
    println("4 exist in the list 'Functional way' :"+FileMatching.containsFunctionalWay(4))

    //Curried Function testing
    println()
    println("Curried Function")
    println("Normal additon :"+FileMatching.normalAdd(4,5))
    println("Curried addition :"+FileMatching.curriedFunction(5)(6))
    val first = FileMatching.spiltCurriedFnValue(2)
    println("Adding the curried values using function values :"+first(3))
    val curriedFirst = FileMatching.curriedFunction(17)_
    println("Adding the curried values based on partial applied functions:"+curriedFirst(10))

  }
}
