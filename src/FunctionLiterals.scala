/**
  * Created by MacUser on 21/07/17.
  */
object FunctionLiterals {

  def main(args: Array[String]): Unit = {

    val testList : List[Int] = List(1,2,3,4,5)

    testList.foreach(println _) //This method is partially applied method with underscore
    testList.foreach(print) // Print method is also partially applied method without underscore.


    println(testList.filter(_>2))
    println(testList.filter(x=> x<2))


    def sum(a : Int,b : Int,c : Int) = a+b+c

    val testValue = sum(1,2,3)
    println(testValue)

    val testValue2 = sum _ // With the help of partially applied function, this will return the object of function value. Which can be passed as argument, etc etc.
    println("This is function vlaue which is class generated function object: "+testValue2)
    println("This take 3 parameters by default :"+testValue2(1,2,3)) // This takes 3 parameters by default, becuase it is refering to sum method which take 3 parameters.
    println("Method call using apply method : "+testValue2.apply(4,5,6)) // The apply method found for class generated function object(function value).


    val missingParameter = sum(_:Int,3,4)
    println("When Missing parameter is passed :"+missingParameter(1)) // When we pass missing parameter here, it will add that number with parameters which are passed earlier.



    //Closure example

    //The function value created during run time from the function liter using free variable is called Closure. Here free variables means which are defined before.

    var more =10045

    val firstClosure = (x : Int) => x+more // This function literal uses the free variable more which is predefined before.

    println(firstClosure(10))

    more = 1000

    println("After changing the value :"+firstClosure(100))

    //The free variable changed before function literal can be used within closure.
    //The free variable changed within closure will be reflected later after closure.

    var tSum = 0

    val sumList = testList.foreach(tSum += _)

    println("The total value from the list is :"+tSum)



    def squareOfGivenNumber() = (x:Int) => x*x

    val findSquare = squareOfGivenNumber

    println(findSquare(2))
    println(findSquare(55))

  }

}
