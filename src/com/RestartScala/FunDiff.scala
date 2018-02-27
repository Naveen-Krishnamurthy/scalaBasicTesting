package com.RestartScala

/**
  * Created by MacUser on 27/02/18.
  */
class FunDiff {

  def greeting() = "This is greeting method"

  def greetingWithoutPar = "This is greeting Method without paranthesis which supports uniform access principal"

}

object ObjFunDiff {

  def main(args: Array[String]): Unit = {

    val testFunDiff = new FunDiff()
    println(testFunDiff.greeting())
    println(testFunDiff.greetingWithoutPar)

  }
}
