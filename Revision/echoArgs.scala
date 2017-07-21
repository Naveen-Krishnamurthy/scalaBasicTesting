
//Imperative style of coding
var i =0 
while(i < args.length) {
	if(i!=0)
		print(" ")
	print(args(i))
	i+=1
}
println()

//Advanced functional style of programming
args.foreach(arg => println(arg))


//Functional style of programming
args.foreach(println)


//Normal forLoop - Indeed functional style of coding
for(arg <- args)
	print(arg)