class primaryConstructorCheck(firstValue : String) {

	//Primary constructor will execute the firt line, it will check for the class parameters, if it is null it will throw NullPointerException exception. 
	//Primary constructors are kind of hidden constructos, which will be executed before any class variable initalization & def executions. It will assign class parameters
	//to final vals which can be accessbile only with in the class
	if(firstValue == null){
		throw new NullPointerException("The class Parameter is null, please pass the non null values")
	}

	def firstValuePrint() = println(firstValue)
}

val instancePrimary=new primaryConstructorCheck(null)
instancePrimary.firstValuePrint()