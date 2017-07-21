class VariableScopping {

	var field1:Boolean=true;
	val field2:Float=56.77f;

	def localParametersMethod() {
		//Local values(immutable)
		val (lclval1, lclval2)=(556,345.66);//These variables cannot be accessed outside the methods;
		println("The addition of the these values are :"+lclval1+lclval2);
		println("Field 1 and 2 can be accessed inside the method :"+field1+field2);

		//Local variables(mutable)	
		var (lclVar1,lclVar2)=('c',"This is Scala variable");
		println("The concatination of these 2 variables :"+lclVar1+lclVar2);
	}

	def methodParameters(metPar1:Double,metPar2:String) {
		println("This is Method parameter 1 :"+metPar1);
		println("This is Method parameter 2 :"+metPar2);
		//metPar1=77.8d;
		// println("After change :"+metPar1);
	}
}


object LocalParameterTest {
	def main(args:Array[String]) {
		val varScoping=new VariableScopping();
		varScoping.localParametersMethod();
		varScoping.field1=false;
		println("The Field2 can be changed if it is var type :"+varScoping.field1);
		varScoping.methodParameters(456.55d,"Method Parameters");
		//println("This is the Local Paramets cannot be accessed outside the metodh :"+varScoping.lclval1);
	}
}