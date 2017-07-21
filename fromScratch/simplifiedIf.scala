object simplifiedIf {
	def main(args:Array[String]) {
		val fileName= {
			if(!args.isEmpty) 
				args(0)
			else
				"default.txt"
		}
		println("This is fileName ->"+fileName)
	}
}