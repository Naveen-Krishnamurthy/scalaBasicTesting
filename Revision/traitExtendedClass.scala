trait simpleTrait {
	def greet() = "Hi Welcome"
}

trait extendedTrait extends simpleTrait {
	override def greet() = super.greet()+"Overrided version of extended trait"
}

trait extendedTrait2 extends simpleTrait {
	override def greet() = "Latest overrided version fo extended trait"
}

class traitExtendedClass extends simpleTrait {
	override def greet() = "Overrided version from trait"
}