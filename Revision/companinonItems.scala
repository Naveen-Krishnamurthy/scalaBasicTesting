class companinonItems(value : Int) {
	val square : Int = companinonItems.calcuateSquare(value)

	def printSquareNumber() {
		println("The square of the given number is :"+square)
	}
}

object companinonItems {
	def calcuateSquare(number : Int) : Int = {
		number*number
	}
}