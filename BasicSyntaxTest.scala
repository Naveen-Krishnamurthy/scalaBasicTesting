object BasicSyntaxTest {
	def main(args :Array[String]) {
		var intType: Int=0;
		intType=6+7;
		println("This is the integer type :"+intType);

		//Variable Type Interference
		var someType="This is String variable";
		println("This is the value of the variable :"+someType);

		//Difference Between Variable and value
		//Var 

		var mutableData:Int=66;
		println("Before changing the value :"+mutableData);
		mutableData=100;
		println("After changing the value :"+mutableData);

		//val

		val immutable:Int=777;
		println("Before changing the value :"+immutable);
		//immutable=72821;
		//println("After changing the value :"+immutable);


		//Multiple Declarations with Variable type(Mutable)

		var (mltVar1,mltVar2)=Pair(40,"Hi Scala");
		println("First value :"+mltVar1);
		println("Second value :"+mltVar2);
		mltVar1=4738992;
		println("First value after change :"+mltVar1);
		println("Second value :"+mltVar2);

		//Multiple Declarations with Value type(Immutable)
		val (mltVal1,mltVal2)=Pair(9020,"Welcome Scala");
		println("First value :"+mltVal1);
		println("Second value :"+mltVal2);
		// mltVal1=4738992;
		println("First value after change :"+mltVar1);
		println("Second value :"+mltVar2);


		

	}
}