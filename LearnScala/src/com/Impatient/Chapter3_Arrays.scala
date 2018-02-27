package com.Impatient

import scala.Array._
import scala.collection.mutable.ArrayBuffer

/**
  * Created by MacUser on 19/10/17.
  */
class Chapter3_Arrays {

}

object firstArrayElements {
  def main(args: Array[String]): Unit = {
    val num = new Array[Int](10);// num is the array having 10 Integer elements with 0 value by default
    val testString = new Array[String](10); // testString is the array of String having each element with null value.
    val testString2 = Array("Scala","Java");
    println(testString2(1))
    testString2(1)="Welcome";

    for(repString <- testString2) {
      println(repString)
    }


    val arrayBufInt = new ArrayBuffer[Int]();
    arrayBufInt+=1

    println(arrayBufInt)

    arrayBufInt+=(1,2,3,4)

    println(arrayBufInt)

    arrayBufInt ++= num

    println(arrayBufInt)

    arrayBufInt.trimEnd(4)

    println(arrayBufInt)

    arrayBufInt.insert(2,6)

    println(arrayBufInt)

    arrayBufInt.insert(4,8,8,8)

    println(arrayBufInt)

    arrayBufInt.remove(2)

    println(arrayBufInt)
    println(arrayBufInt)

    val convertedArray = arrayBufInt.toArray

    for(i <- 0 until convertedArray.length) {
      println(i +":"+convertedArray(i))
    }

    val testArray = Array(1,2,3,4,5,6,7)

    val resultArray = for(element <- testArray) yield {
      println(element)
      element*2
    }


    for(i <- 0 until resultArray.length) {
      println(i+":"+resultArray(i))
    }

    val resultArray2 = for(element <-testArray if(element%2==0)) yield{
      println(element)
      element*2
    }

    for(i <- 0 until resultArray2.length) {
      println(i+"-->"+resultArray2(i))
    }

    val arrayIncludesNegative = Array(-1,0,3,-5,6,-8,9,11)

    var first = false

    val indexes = for(i <- 0 until arrayIncludesNegative.length if first || arrayIncludesNegative(i)>=0) yield {
      if(arrayIncludesNegative(i)<0) first=true;  i
    }

    for(element <- indexes) {
      println(element)
    }

    println(arrayIncludesNegative.sum)

    val stringArrayElement = Array("Naveen","naveen","Scala","scala","Girish","anish")
    println(stringArrayElement.max)
    println(stringArrayElement.min)


    val testArrayBuffer = ArrayBuffer(2,4,5,6,7,1,3)
    val sortedTestArrayBuffer = testArrayBuffer.sorted
    val sortedDescendingArrayBuffer = testArrayBuffer.sortWith(_ > _)
    println(sortedTestArrayBuffer)
    println(sortedDescendingArrayBuffer)


  }
}

object multiDimensionalArray {
  def main(args: Array[String]): Unit = {

    val matrix =Array.ofDim[Int](3,3)


    for(i <- 0 until 3 ; j <- 0 until 3)  {
      matrix(i)(j)=i+j;
    }

    for(i <- 0 until 3 ; j <- 0 until 3) {
      println(i+","+j+":"+matrix(i)(j))
    }

  }
}
