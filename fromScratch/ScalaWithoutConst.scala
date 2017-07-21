class ScalaWithoutConst(name:String) {
	def printName() ={println(name)}
}

var withoutConst=new ScalaWithoutConst("Arsenal")
withoutConst.printName()
//withoutConst.name="New Value" - This line will throw an error, since name is private member of class ScalaWithoutConst & it cannot be accessed outside the class. 


