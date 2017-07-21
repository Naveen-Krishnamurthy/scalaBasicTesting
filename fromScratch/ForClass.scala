object ForClass {
	def main(args:Array[String]) {
		for(i <- 1 to 10)
			println("The value of i is:"+i)


		//Until method will return all elements by excluding last element of the range. 
		for(j <- 5 until 10)
			println("The value of until i is:"+j)


		//Multiple for loops
		for(i <- 1 to 10 ; j <- 1 until 10) {
			println("The value of i & j is :"+i+","+j)
		}

		//For with filtering single loop
		for(i <- 1 to 10 if(i==6))
			println("The value of i after filtering is :"+i)

		//For with multiple filtering
		for(i <- 1 to 10 if(i==6); j <- 1 until 10 if(j==6)) {
			println("The value of i & j is :"+i+","+j)
		}

		//For loop returning the value
		val forReturnValue= for(i <- 1 to 10 if(i==6); j <- 1 until 10 if(j==6)) 
		yield {
			i
		}

		prinltn("Returned value of multiple for loop is :"+forReturnValue)	
	}
}