class printMultiTable {
	def printTable() {
		for(i <- 0 to 5) {
			for(j <- 0 to 5) {
				val product=(i*j).toString()
				print(String.format("%4s",Array(product)))
			}
			println()
		}
	}
}

object testMultiTable {
	def main(args:Array[String]) {
		val table=new printMultiTable()
		table.printTable()
	}
}