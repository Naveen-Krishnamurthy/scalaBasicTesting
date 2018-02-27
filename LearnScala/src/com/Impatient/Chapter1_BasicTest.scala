package com.Impatient

/**
  * Created by MacUser on 08/10/17.
  */

import scala.math._
import scala.util._

class Chapter1_BasicTest {

  val firstValue : Double =4

  def findSquareRoot(): Unit = {
    println(sqrt(firstValue))
  }

}

object Chapter1_BasicTest {
  def findPower(x : Double,y: Double): Unit = {
    println("Power is :"+pow(x,y))
  }

  def findMin(x : Double, pi : Double) : Unit ={
    println("Min is :"+min(x,pi))
  }
}


object testChapter1 {
  def main(args: Array[String]): Unit = {
    val testChap1Obj : Chapter1_BasicTest = new Chapter1_BasicTest();
    testChap1Obj.findSquareRoot
    Chapter1_BasicTest.findPower(2,3)
    Chapter1_BasicTest.findMin(3,3.14)
    println(BigInt.probablePrime(100,scala.util.Random))
    println("Hello".distinct)
    val testString : String = "This is very first time i'm learning Scala"
    println(testString(5))
    println(testString(8))
    println(testString.patch(3,"werqwerqwerqwer",10))

    val bigIntValue : BigInt = BigInt(2).pow(1024);

    println(bigIntValue)
    println(10.max(2))

  }
}


object generateRandomNumber {
  def main(args: Array[String]): Unit = {
    val random: Random = new Random();

    val bigInt : BigInt  = BigInt.probablePrime(100,random);
    println(bigInt.toString(36))

    val takeString : String = "This is Naveen & i'm working on Scala now"

    println(takeString.take(3))
    println(takeString.drop(10))

  }
}
