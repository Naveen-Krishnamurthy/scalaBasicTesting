class methodWitOneParameter {
	def method(tempString:String) {//Method with one Parameter
		print(tempString)
	}
}


object callMethodWithOneParameter {
	def main(args:Array[String]) {
		var mthWithOne=new methodWitOneParameter()
		mthWithOne method "Naveen " //Method with one Parameter can be invoked without . & Parantheses
		mthWithOne method "Scala "
		mthWithOne method "Welcome "
		mthWithOne.method("Hai")
	}
}