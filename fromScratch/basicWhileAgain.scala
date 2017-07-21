class basicWhile {
	def gcd(x:Long, y:Long) : Long = {
		var a=x
		var b=y
		while(a != 0) {
			val temp=a
			a=b%a
			b=temp
		}
		b
	}

	def testFor() {
		for(i <- 1 to 5) {
			println("Iteration :"+i)
		}
	}

	def testFiltering() {
		//This will filter the for loop expression, we'll be using the ';' & if condition to filter the iterations
		for {
			i <- 1 to 10 ; 
			if(i>=5) ;
			if(i<=7) } {
			println("Iteration :"+i)
		}

	}
}

object testBasicWhile {
	def main(args:Array[String]) {
		val basicWhileObject=new basicWhile()
		println("The gcd if 3,4 is :"+basicWhileObject.gcd(3,4))

		//Testing the basic for
		basicWhileObject.testFor()
		println("Filtering the data")
		basicWhileObject.testFiltering() //Filtering
	}
}