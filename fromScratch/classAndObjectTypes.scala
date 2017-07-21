class demoClass {
	var i=10;
	private var j="String"
}

object classTest {
	def main(args:Array[String]){

		val obj1=new demoClass()
		val obj2=new demoClass()

		//Before chaning the variable i 
		println("Before obj1:"+obj1.i)
		println("Before obj2:"+obj2.i)

		//After chaning the variable 
		obj1.i=6
		println("After obj1:"+obj1.i)
		println("After obj2:"+obj2.i)

		//Private variable not accessible outside the class
		// println("Will throw an exception :"+obj1.j)
		// println("Will throw an exception :"+obj2.j)

		
	}
	
}
