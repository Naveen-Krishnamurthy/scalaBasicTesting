package com.Impatient

/**
  * Created by MacUser on 24/10/17.
  */

//Companion Object & class
class Chapter6_Objects(passedValue : Int=0) {

  def checkDiff(): Unit = {
    val result = if(passedValue >= Chapter6_Objects.testValue) {
     "Passed Value is greater than the test value"
    } else "Passed Value less than the test Value"
    println(result)
  }
}

object Chapter6_Objects {
  private var testValue = 10
  def incrementTestValue(index : Int) = testValue+=index
}

object testCompanionObject {
  def main(args: Array[String]): Unit = {
    val objectChapter6 = new Chapter6_Objects(15)
    objectChapter6.checkDiff() // Calling the method defined in the class
    Chapter6_Objects.incrementTestValue(7)// Calling the method defined within the companion object
    objectChapter6.checkDiff() // Checking the difference after the increment
  }
}


//Single ton object test

object SingleTonObject {
  var dummayValue=  10
  def displayFieldsIncremented(newData : Int): Unit = {
    dummayValue+=newData
    println(dummayValue)
  }
}

object testSingleTonObject {
  def main(args: Array[String]): Unit = {
    println(SingleTonObject.dummayValue)
    SingleTonObject.displayFieldsIncremented(56)
  }
}

//Application object

object testAppObject extends App {
  println("This object is executed without the mian method, its all because of App trait in Scala")
}

object testAppObjectWithArgs extends App {
  if(args.length > 0){
    for(arg <- args)
      print(arg+",")
    println()
  }
  else
    println("No Arguments")
}


//Enumeration

class testEnum extends Enumeration {

}


