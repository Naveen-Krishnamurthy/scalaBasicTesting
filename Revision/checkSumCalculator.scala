class checkSumCalculator {
	private var sum=0

	def calculate(b : Byte) : Unit = {
		sum+=b
	}

	def retunCalculate() : Int = {
		~(sum & 0xFF)+1
	}
}

object testCheckSumCac {
	def main(args:Array[String]) {
		val cal1=new checkSumCalculator();
		val cal2=new checkSumCalculator()

		cal1.calculate(-5)
		//Print the checkSumCalculator for 1st number
		println("The checkSumCalculator for 1st number is :"+cal1.retunCalculate)

		cal2.calculate(-6)
		//Print the checkSumCalculator for 1st number
		println("The checkSumCalculator for 2nd number is :"+cal2.retunCalculate)
	}
}