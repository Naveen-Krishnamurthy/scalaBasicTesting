/**
  * Created by MacUser on 23/02/18.
  */
class AirthmaticFunctions {

  def addition (a : Int, b : Int) = {
    println("Adding the numbers :"+(a+b))
  }

  def factorial(a : Int) : Int = {
    if(a==0) 1 else a*factorial(a-1);
  }

  def primeNumber(a : Int) = {

  }

}

object artihMatciFunction {
  def main(args: Array[String]): Unit = {
    var addition: AirthmaticFunctions = new AirthmaticFunctions();
    addition.addition(4,5)
    println(addition.factorial(5))

  }
}
