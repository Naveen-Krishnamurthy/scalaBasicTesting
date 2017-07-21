class auxiliaryConstructor(firstValue : String, firstNumber : Int) {
	
	//Primary constructor wil check for the string & first number value 
	if(firstValue == null || firstNumber == -1) 
		throw new NullPointerException("Invalid data please pass the correct data")


	//Auxiliary constructors taking 1 parameters of different types
	def this(firstValue : String) = this(firstValue , 0)
	def this(firstNumber : Int) = this("No Value",firstNumber)

	
	def printFirstValueNum() = {
		println("FirstValue is :"+firstValue)
		println("FirstNumber is :"+firstNumber)
	}	

}

val instanceAuxConst1=new auxiliaryConstructor("Naveen",1)
val instanceAuxConst2=new auxiliaryConstructor("Girsh")
val instanceAuxConst3=new auxiliaryConstructor(3)
instanceAuxConst1.printFirstValueNum
instanceAuxConst2.printFirstValueNum
instanceAuxConst3.printFirstValueNum

//Null Pointer exception
val instanceAuxConst4=new auxiliaryConstructor(null,-1)