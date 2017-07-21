import scala.collection.mutable.HashSet

var newSet=new HashSet[Int]
newSet+=123
newSet+=(456,789)
println(newSet(2))