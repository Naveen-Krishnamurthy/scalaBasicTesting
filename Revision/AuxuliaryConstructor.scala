class testAuxuliaryConstructor(name:String, age:Int) {
	def this(name:String) = this(name,0)
	def this(age:Int) = this(null,age)

	def displayInfo = print("Name is :"+name+"& age is :"+age)
}

object testScalaAuxulary {
	def main(args:Array[String]) {
		val obj1:testAuxuliaryConstructor=new testAuxuliaryConstructor("Naveen",23)
		val obj2:testAuxuliaryConstructor=new testAuxuliaryConstructor("Girish")
		val obj3:testAuxuliaryConstructor=new testAuxuliaryConstructor(6)

		obj1 displayInfo()
		obj2 displayInfo()
		obj3 displayInfo()
	}
}