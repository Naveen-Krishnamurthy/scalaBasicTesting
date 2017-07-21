class ScalaPrimaryConst(name:String) {
	if(name==null) {
		throw new NullPointerException("Passed argument is null")
	}

	def displayName() ={println(name) }
}

//var emptyValue=new ScalaPrimaryConst() This will throw the exception the Constructor will take one argument here.
var withoutNullValue=new ScalaPrimaryConst("Naveen")
withoutNullValue.displayName()
//var nullValue=new ScalaPrimaryConst(null) 

//This code will check for null value, if the passed consturctor parameter is null,then it will throw null pointer exception or else it will execute remaining statement of the code.

