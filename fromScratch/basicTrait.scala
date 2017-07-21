trait Interface {
	def display() ="Welcome to Scala trait"
}

class cloneInterface extends Interface {
	override def display() ="Extended version of method"
}

object traitBasicEx {
	def main(args:Array[String]) {
		val traitObj=new cloneInterface()
		println(traitObj.display())
	}
}