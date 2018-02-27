package com.Impatient

/**
  * Created by MacUser on 21/10/17.
  */


import java.util.TreeMap

class Chapter4_Maps {

}

object testMaps {
  def main(args: Array[String]): Unit = {

    val firstMap = Map("First"->1,"Second"->2,"Third"->3)

    println(firstMap.get("First"))


    val immutableMap = scala.collection.immutable.Map(4->"Fourth",5->"Fifth")

    println(immutableMap.get(5))
    println(immutableMap.get(8))


    val returnedElement = if(immutableMap.contains(4)) immutableMap(4) else 0

    println(returnedElement)

    println(immutableMap.getOrElse(4,0))



    val mutableMap= new scala.collection.mutable.HashMap[Int,String]

    mutableMap(1)="Naveen"
    println(mutableMap(1))
    mutableMap(1)="UpdatedName"
    println(mutableMap(1))
    mutableMap+=(2->"AppendedName1",(3,"AppendedName2"),4->"AppendedName4")
    println(mutableMap)

    println(immutableMap)
    var dummayMap = immutableMap + (1-> "First",2->"Second")

    println(dummayMap)
    dummayMap += (10->"Ten")
    println(dummayMap)


    for((k,v) <- dummayMap) {
      println(k+"-->"+v)
    }

    val keySet = dummayMap.keySet
    println(keySet)

    val valueSet = dummayMap.values
    println(valueSet)

    for(i <- valueSet) {
      println(i)
    }

  }
}

object javaTreeMapTest {
  def main(args: Array[String]): Unit = {

    val javaTreeMap = new TreeMap[Int,String]

    javaTreeMap.put(1,"First")
    javaTreeMap.put(5,"Five")
    javaTreeMap.put(2,"Second")

    println(javaTreeMap)

    val immutableTreeMap = javaTreeMap

    println(immutableTreeMap)


    val firstTuple = new Tuple3[Int,Double,java.lang.String](1,3.14,"Scala")

    println(firstTuple._1)

  }
}
