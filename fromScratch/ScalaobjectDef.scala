class ScalaobjectDef(auxObj:String) {
	def displayObjectName() {
		var sampObje=ScalaobjectDef.printName(auxObj)  // Way of accessing the methods defined in Companion objects
		println("Companion value is :"+ScalaobjectDef.newValue)
	}
}

//Companion object which is having similar name to Class, It will hold the methods & variables which are kind of Static in Java. 
object ScalaobjectDef { 
	{ println("NewValue")}
	def printName(compObject:String) {
		println("Value is :"+compObject)
	}
	var newValue=5
}

// var extObj=new ScalaobjectDef("Naveen")
// extObj.displayObjectName()