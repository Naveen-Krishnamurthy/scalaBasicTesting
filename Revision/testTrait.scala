object testTrait {
	def main(args:Array[String]) {
		val testTraitObj: simpleTrait = new traitExtendedClass with extendedTrait
		println(testTraitObj.greet())
	}
}