val greetMessage = new Array[String](4)
greetMessage(0) = "Hello "
greetMessage(1) = "Welcome "
greetMessage(2) = "to "
greetMessage(3) = "Scala\n"


//Normal forloop with iteration
println("Normal for loop with iteration")
for(i <- 0 to 3)
	print(greetMessage(i))


println("Normal functional style")
//Printing the array using forloop(functional style)
for(iterate <- greetMessage) {
	print(iterate)
}
println("Advanced functional style")
// Printing the array using foreachLoop(Advanced Functional Style)
greetMessage.foreach(print)


//Printing the array using foreachLoop(Advanced Fucntional style)
println("Very Advanced functional style")
greetMessage.foreach(iterate => print(iterate))