package com.ProgrammingInScala
import util.control.Breaks._


/**
  * Created by MacUser on 25/10/17.
  */
class  Chapter2 {
  private val intValue : Int = 100
  val stringValue : String = "Naveen"
  private val booleanValue : Boolean = true
}


object testPrimeNumber {
  def main(args: Array[String]): Unit = {

    val number: Int = 11
    var flag : Boolean =false;

    breakable {
      for (i <- 2 to (number / 2)) {
        if (number % i == 0) {
          flag = true;
          break
        }
      }
    }

    if(flag)
      println("Its not prime number")
    else
      println("Its a prime number")

  }
}


object testApp extends App {
  println("You can execute the steatement in object without use of main method")
}