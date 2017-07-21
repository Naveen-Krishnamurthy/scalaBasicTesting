import java.math.BigInteger
class FactorialTest {
	def factorial(x:BigInt): BigInt ={
		if(x==0)
			1
		else 
			x*factorial(x-1)
	}

	def javaBigIntFactorial(x:BigInteger): BigInteger={
		if(x==BigInteger.ZERO) 
			BigInteger.ONE
		else
			x.multiply(javaBigIntFactorial(x.subtract(BigInteger.ONE)))

	}
}

object TestFact {
	def main(args:Array[String]) {
		var factTest=new FactorialTest();
		val BigIntegerValue:BigInteger=BigInteger.TEN;
		println("Factorial of 20 is:"+factTest.factorial(10))
		println("Factorial of 5 is:"+factTest.javaBigIntFactorial(BigIntegerValue))
	}
}