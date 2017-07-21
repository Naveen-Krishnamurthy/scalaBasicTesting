class checkSum {
	private var sum=0

	def add(value:Byte) { sum+= value }

	def checkSum : Int = { ~(sum & 0xFF) +1}
}

object checkSum {
	def calCheckSum(s:String) :Int = {
		var cc=new checkSum
		for(c <- s)
			cc.add(c.toByte)

		cc.checkSum
	}
	
}

object calculateChecksum {

	def main(args:Array[String]) {
		var checkValue=checkSum.calCheckSum("Naveen")
		println(checkValue)
	}
	
}