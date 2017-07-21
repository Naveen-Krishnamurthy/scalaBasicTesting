class enhancedCheckSum {
	private var sum=0
	def add(b:Byte) { sum+=b }
	def checkSum : Int = ~(sum & 0xFF)+1
}

object testEnhancedChecksum {
	def main(args:Array[String]) {
		val cal1=new enhancedCheckSum();
		val cal2=new enhancedCheckSum()

		cal1.add(25)
		//Print the checkSumCalculator for 1st number
		println("The enhancedCheckSum for 1st number is :"+cal1.checkSum)

		cal2.add(36)
		//Print the checkSumCalculator for 1st number
		println("The enhancedCheckSum for 2nd number is :"+cal2.checkSum)
	}
}