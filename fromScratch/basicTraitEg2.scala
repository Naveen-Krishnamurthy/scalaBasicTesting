trait Friendly {
	def display() = "Hi"
}

class Dog extends Friendly {
	override def display() ="Woof"+super.display()
}

class Cat extends Friendly {
	override def display()="Meow"
}

class hungryDog extends Dog {
	override def display()="I'm really hungry"+super.display()
}

class hungryCat extends Cat {
	override def display()=super.display()+" Meow, i'm really hungry"
}

trait newFridnly extends Friendly {
	override def display() = super.display()+"!";	
}

object dynamicBindingTrait {
	def main(args:Array[String]) {
		var newPet:Friendly=new Dog with Friendly()
		println(newPet.display())

		var newPet2:Friendly=new Cat()
		println(newPet2.display())

		var newPet3:Friendly=new hungryDog()
		println(newPet3.display())

		var newPet4:Friendly=new hungryCat()
		println(newPet4.display())

		var newPet5:Friendly=new Dog with newFridnly()
		println(newPet5.display())
	}
}