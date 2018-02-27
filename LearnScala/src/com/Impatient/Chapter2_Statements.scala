package com.Impatient

/**
  * Created by MacUser on 11/10/17.
  */


import scala.util.control.Breaks._

class FunctionTest {

  def abs(x : Double) = if(x>=0) x else -x

  def fact(n : Int) : Int = if(n<=0) 1 else n*fact(n-1)

  def decorator(value : String, left: String = "[", right : String = "]") = left+value+right

  def addVars(testValue : Int *):  Int = {
    var result = 0
    for(arg <- testValue) {
      result = arg+result
    }
    result
  }

  def addVarsRec(testValue : Int*) : Int = {
    if(testValue.length==0) 0
    else testValue.head + addVars(testValue.tail:_*)
  }

  def procedureExample(str : String) {
    println(str)
  }
}



object testReadLine {
  def main(args: Array[String]): Unit = {
    val name : String = readLine("Your name please :")
    val age : Int = readInt()
    printf("Hello, you are %s! and your age is %d.\n",name,age)
  }
}

object testLoops {
  def main(args: Array[String]): Unit = {

    var n : Int = 10
    var i : Int =1
    while(n > 0) {
      i=i*n
      n=n-1
    }

    println("The i value is :"+i)

    for(i <- 1 to 10) {
      print(i+",")
    }
    println()

    val s = "Hello"
    for(i <- 0 until(s.length)) {
      print(s(i)+",")
    }
    println()

   breakable {
     for(i <- 1 to 10) {
       if(i%2==0) {
         println("1st Even number ->"+i)
         break()
       }
     }
   }

    var a,b=0
    val result = for(a <- 1 to 10 ; b <- 21 to 30 if(a==5)) yield {
      a+b
    }
    println(result)

    val c = '0'
    val result1 = for(c <- "Hello" ; a <- 1 to 10) yield {
      (c+a).toChar
    }
    println(result1)

    val result2 = for {
      a <- 1 to 10
      c <- "Hello" }
      yield {
        (c+a).toChar
      }

    println(result2)

    val funTest : FunctionTest = new FunctionTest()
    println(funTest.abs(-9))
    println(funTest.fact(5))
    println(funTest.decorator("Naveen"))
    println(funTest.decorator("Naveen","<<<",">>>"))
    println(funTest.decorator("Naveen","<<<"))
    println(funTest.decorator(left = "<<<",value = "Naveen"))
    println(funTest.addVars(1,2,3,4,5,6))
    println(funTest.addVarsRec(1,2,3))
    funTest.procedureExample("Naveen")

  }

}

object testForLoop {
  def main(args: Array[String]): Unit = {

    val s = for(i <- 1 to 10 ; j <- 20 to 30) yield {
      i*j;
    }

    println(s)


  }
}
