object basicIf {
	def main(args:Array[String]) {
		var fileName="default.txt"
		if(!args.isEmpty) {
			fileName=args(0)
		}
		println("This is fileName ->"+fileName)
	}
}