object StringLiteral {
	def main(args:Array[String]) {
		val testValue:String = """|This is the multiline String which is having lot of 
						|spaces & white tabs. When we print     this string it may not look properly""".stripMargin

		println(testValue)
	}
}