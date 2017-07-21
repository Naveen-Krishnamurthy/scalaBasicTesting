object basicWhile {

	def gcdValue(x:Long, y:Long) : Long = {
			var a=x ; var b=y
			while(a!=0) {
				var temp=a
				a=b % a
				b=temp
			}
			b
		}


	def main(args:Array[String]) {
		println(gcdValue(4,16))
	}
}