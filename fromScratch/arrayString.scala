val greetingMessage=new Array[String](4)
greetingMessage(0)="Hello "
greetingMessage(1)="Welcome "
greetingMessage(2)="to "
greetingMessage(3)="scala"+"\n"

//Basic style of for loop
for(i<-0 to 3){
	print(greetingMessage(i))
}
println()

//Enhanced version 
for(temp<-greetingMessage)
print(temp)
 
 //Enhanced advance version
greetingMessage.foreach(print)
greetingMessage.foreach(println)


