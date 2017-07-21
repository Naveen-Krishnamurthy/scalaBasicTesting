object LiteralExample {
	def main(args:Array[String]) {

		//Integer Literals 
		var i="""This is Naveen          
		asdfasdf welcome """

		var j="""|This is Naven 
		|        asdfadf     adsfasdf      asdfasdf"""

		println(i)
		println(j.stripMargin)
	}
}