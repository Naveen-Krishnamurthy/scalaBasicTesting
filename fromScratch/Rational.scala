class Rational (n : Int, d : Int){

	//Statement for Primary contructor
	//println("values are :"+n+"/"+d)

	//Private memeber to decide GCD number 
	private val gcdNum=gcd(n,d)
	val numr : Int = n/gcdNum
	val denom: Int = d/gcdNum

	//Auxilary constructor without denominator
	def this(num : Int) = this(num, 1)

	//Auxilary constructor without Numerator
	def this() = this(1, 1)

	//Auxilary constructors indicates invalid one
	def this(value:String) = { this(); println("Invalid data type, by default the values are assigned to 1")}

	//Adding the number
	def +(rat: Rational) : Rational= {
		new Rational(numr * rat.denom + denom * rat.numr, denom * rat.denom)
	}

	//Substracting the rational numbers
	def -(rat: Rational) : Rational= {
		new Rational(numr * rat.denom - denom * rat.numr, denom * rat.denom)
	}

	//Multiply the rational numbers
	def *(rat: Rational) : Rational= {
		new Rational(numr * rat.numr , denom * rat.denom)
	}

	//Division of Rational numbers
	def /(rat: Rational) : Rational= {
		new Rational(numr * rat.denom , denom * rat.numr)
	}

	//Override the toString method from Object class 
	override def toString() = { numr+"/"+denom }

	//Private Method to Normalize(find greatest comman divisor)
	private def gcd(x: Int, y: Int) : Int = {
		if(y==0)
			x
		else 
			gcd(y, x % y)
	}
	
}