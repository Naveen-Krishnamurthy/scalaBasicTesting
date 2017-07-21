import scala.collection.mutable.HashMap

val mutHashMap=new HashMap[Int,String]
mutHashMap+=(1 -> "Naveen")
mutHashMap.+=(2 -> "Girish")
println("1st element of Mutable HashMap :"+mutHashMap(1))