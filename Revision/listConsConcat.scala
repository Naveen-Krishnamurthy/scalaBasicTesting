val newList=List(1,2,3)
val latestList=List(5,6)

//Cons are used to contantinate the list,

val conCatedList=1::latestList

println("First list :"+newList)
println("Second list :"+latestList)

//Concatinated List 
println("conCatedList :"+conCatedList)

/* Cons will concatinate the multiple list, e.g: if users call latestList::newList which will turns to method call newList.::(LatestList), 
in this case the new list will be prepends to invoked to list */

/*If method ends with ':" then it will be invoked in reverse order a::b -> b.::(a), if method ends with any of the parameter e.g a*b, it will invoked in straight order
a.*(b)*/




