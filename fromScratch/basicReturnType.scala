class returnType {

	//Method explicitly defining an return type, 
	def returnUint :String ={
		"It has nothing to return here"
	}

	def returnValue =5+10
}

object basicReturnType {
	def main(args:Array[String]) {
		var s=new returnType()
		println(s.returnUint)
		println(s.returnValue)
	}
}