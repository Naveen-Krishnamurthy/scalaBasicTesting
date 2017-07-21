//emptyList
val emptyList=List()

println("Empty list :"+emptyList)

//Empty list using Nil
val emptyListNil=Nil
println("Empty list nill:"+emptyListNil)

//basic List
val basicList=List("one","two","three")
println("Basic List :"+basicList)

//basic List 2
val append=1::2::3::Nil
println("AppendedList :"+append)

//Get 2nd element
println("2nd element without apply method :"+basicList(2))

//Get 2nd element using apply method
println("2nd element with apply method :"+basicList.apply(2))

//Update the existing elements of the List
//basicList.update(2,"Five")

//Get the updated value for 2nd element of the List
println("@2nd Element after updated "+basicList.apply(2))

//To count the number of elements having length 2
println("Count is :"+basicList.count(s => s.length==3))

//Droped list element from left side
println("Element dropped :"+basicList.drop(2))

//Dropped list elements from right side 
println("Element dropped from right :"+basicList.dropRight(2))