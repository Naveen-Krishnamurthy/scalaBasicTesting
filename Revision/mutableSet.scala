import scala.collection.mutable.HashSet

val mutHashSet=new HashSet[String]
mutHashSet+="Naveen"
mutHashSet.+=("Girish")
mutHashSet.+=("Sachin","Tendulkar")
println("Here is the mutable HashSet :"+mutHashSet)
mutHashSet.+=("Girish")
println("Here is the complete mutable HashSet :"+mutHashSet)