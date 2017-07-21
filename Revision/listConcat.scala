val oneTwoThree=List(1,2,3)
val fiveSix=List(5,6)

//List are immuatable in Scala

println("Before Conctination")
//First list
println("First list :"+oneTwoThree)

//Second List
println("Second List :"+fiveSix)

val newList=oneTwoThree:::fiveSix

println("After Conctination")

//First list
println("First list :"+oneTwoThree)

//Second List
println("Second List :"+fiveSix)

//New Concatinated List
println("Concatinated List :"+newList)