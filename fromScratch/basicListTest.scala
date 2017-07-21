val newValue=List()
println("New List:"+List)

val emptyList=Nil
println("Empty List:"+emptyList)


//Create List with 3 parameters
val threeParaList=List("No pain","No Gain","so wark hard to Gain	")
println(threeParaList)

//Create List 3 parameters, but last parameter should be Nil
val newParaList="One"::"Two"::"Three"::Nil
println(newParaList)

//The reason that we use cons at the end of the List is, '::' will be invoked on class List, where as elementes in the List are String which don't have '::' methods in it.
//If we use the Nil here, later expression will be convereted like this
//(Nil.::(Three)).::(Two).::(One) 

val oldStyleList=(Nil.::("Three")).::("Two").::("One")
println(oldStyleList)

println("2nd Element is:"+newParaList(1))

//Internal conversion to apply Method
println("3rd element is:"+newParaList.apply(2))

//Getting the List element counts using function Literal 
println(newParaList.count(s=>s.length==3))

//Count the number of elements haivng the specified length in expression.
val newList=List("One","Two","Threeo","Four")
println(newList.count(s=>s.length==3))

//List drop from left side
println("Before dropping:"+newList)
println("Dropped elements:"+newList.drop(2))
println("After dropping:"+newList)

//List drop from right side
println("List dropped from right side:"+newList.dropRight(2))

//exist functinality.
println("Element exist ?:"+newList.exists(s=>s=="One"))

//Filter functionality
println("List of elements haivng length :"+newList.filter(s=>s.length==4))
println("List of elements having length 2:"+newList.filter(s=>s.length==2))

//Indicates all the methods in newList are ends with specified value(string)
println("List ends with o:"+newList.forall(s=>s.endsWith("o")))

//Print the elements of List based on print method passed as argument
newList.foreach(s=>print(s))

//print the element based on print method passed as argument, in this case parameter is not passed
newList.foreach(print)