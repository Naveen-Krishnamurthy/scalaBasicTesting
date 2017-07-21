object basicList {
	def main(arg: Array[String]) {
		val newList=List(1,2,3) //List 1
  		println("Before Concatination:"+newList)

  		val newList2=List(5,6) // List 2
  		println("Before Concatination:"+newList2)

  		//Concatinate the list, which will result in creating new List
  		//Prepending a elements into b
  		println(newList:::newList2);
  		println("Basic method call:"+newList2.:::(newList))
  		println("After Concatination:"+newList)
  		println("After Concatination:"+newList2)

  		//Prepending b elements into a
  		println(newList2:::newList);
  		println("Basic method call"+newList.:::(newList2))

  		//Nil is the keyword which specify empty List in Scala. 
  		var appendNil=1::2::3::4::Nil
  		println(appendNil)
	}
		
}