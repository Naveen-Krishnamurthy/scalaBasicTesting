package com.Impatient

/**
  * Created by MacUser on 24/10/17.
  */
class Chapter5_Class {
  private var prviateAge = 0
  def age = prviateAge
  def age_=(newValue : Int) {
    if(newValue > prviateAge)
      prviateAge=newValue
  }
  var getterTest = null
  val testValue = 0
  private[this] var noGetter = 12
}


class incrementValue {
  private var value = 0
  def increment = value+=1
  def current = value
}

object testClass {
  def main(args: Array[String]): Unit = {
    val firstObject = new Chapter5_Class()
    println(firstObject.age)
    firstObject.age = 25
    println(firstObject.age)
    firstObject.age = 36
    println(firstObject.age)
    firstObject.age=14
    println(firstObject.age)

    //Test the Increment Value
    println("Incremental Value test")
    val incrementObject = new incrementValue()
    println(incrementObject.current)
    incrementObject.increment
    println(incrementObject.current)

  }
}

class Counter {
  private[Counter] var value =0
  def incrementBy(index : Int) = value+=index
  def isLess(other : Counter) = value < this.value
  def current = value
}

object testCounter {
  def main(args: Array[String]): Unit = {
    val counterObject1 = new Counter
    val counterObject2 = new Counter
    counterObject1.incrementBy(10)
    counterObject2.incrementBy(5)
    println(counterObject1.isLess(counterObject2))
    println(counterObject2.isLess(counterObject1))
  }
}

class Person {
  private var name = ""
  private var age = 0

  def this(name : String){
    this()
    this.name = name
  }

  def this(name : String, age: Int) {
    this(name)
    this.age=age
  }

  def displayInfo(): Unit = {
    println("Name is :"+name)
    println("Age is :"+age)
  }
}

object testPerson {
  def main(args: Array[String]): Unit = {
    val objectPerson1 = new Person()
    val objectPerson2 = new Person("Naveen")
    val objectPerson3 = new Person("Sachin",37)
    objectPerson1.displayInfo()
    objectPerson2.displayInfo()
    objectPerson3.displayInfo()
  }
}

class PersonWithPrimary(name : String, age : Int) {
  def this(name : String) = this(name,0)
  def this(age : Int) = this("NoName",age)
  def this() = this("NoName",0)
  println("Object is created with Primary Constructor")
  def displayInfo(): Unit = {
    println("Name is :"+name)
    println("Age is :"+age)
  }
}

object testPersonPrimary {
  def main(args: Array[String]): Unit = {
    val objectPerson1 = new PersonWithPrimary()
    val objectPerson2 = new PersonWithPrimary(39)
    val objectPerson3 = new PersonWithPrimary("Scachin")
    val objectPerson4 = new PersonWithPrimary("Virat",29)

    objectPerson1.displayInfo()
    objectPerson2.displayInfo()
    objectPerson3.displayInfo()
    objectPerson4.displayInfo()
  }
}

class PersonWithPrimaryPrecies(name : String = "NoValue", age : Int =0) {
  println("This Class is having primary constructors & fields with default values")
  def displayInfo(): Unit = {
    println("Name is :"+name)
    println("Age is :"+age)
  }
}

object testPersonWithPrimaryPrecise {
  def main(args: Array[String]): Unit = {
    val objectPerson1 = new PersonWithPrimaryPrecies() //No parameters
    val objectPerson2 = new PersonWithPrimaryPrecies("Sachin") // With Name Parameter
    val objectPerson3 = new PersonWithPrimaryPrecies(age = 44) // With Age parameter
    val objectPerson4 = new PersonWithPrimaryPrecies("Virat",29)

    objectPerson1.displayInfo()
    objectPerson2.displayInfo()
    objectPerson3.displayInfo()
    objectPerson4.displayInfo()
  }
}
