class localVariableTest {
	def multiplyTable() {

		var i=1 //can be accessbile through out the Method

		while(i<=10) {
			var j=1 //Can be accessible within this while loop 

			while(j<=10) {
				var prod=(i*j).toString() //can be accessible within 2nd while loop. 
				var k=prod.length //accessible withint 2nd while loop.

				while(k<4) {
					print(" ")
					k+=1
				}
				print(prod)
				j+=1
			}
			i+=1
		}
	}

	//Advance version
	def advanceMultiplyTable() {
		for(i <-1 to 10) {
			for(j <- 1 to 10) {
				val prod=(i*j).toString
				print(String.format("%4s",Array(prod)))
			}
			println()
		}
	}
}

object VariableScope {
	def main(args:Array[String]) {
		var localVar=new localVariableTest()
		localVar.multiplyTable()
		localVar.advanceMultiplyTable()
	}
}