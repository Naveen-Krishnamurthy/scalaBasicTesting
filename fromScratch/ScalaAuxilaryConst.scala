class ScalaAuxilaryConst(name:String,DOB:Int,Job:String) {
	def this(name:String)=this(name,1885,"withoutJob")
	def this(name:String,DOB:Int)=this(name,DOB,"withDOB&NoJob")
	def this(name:String,Job:String)=this(name,1985,Job)
	def this()=this(null,1,null)

	def displayName() = {
		println(name+" born in:"+DOB+" and job is :"+Job)
	}
}

var auxObj=new ScalaAuxilaryConst("Naveen",1988) // With 2 parameters
auxObj.displayName()

var auxObj2=new ScalaAuxilaryConst("Arsenal") // With 1 parameter
auxObj2.displayName()

var auxObj3=new ScalaAuxilaryConst("Arsenal","Club")
auxObj3.displayName()

var auxObj4=new ScalaAuxilaryConst() // Without Parameter
auxObj4.displayName()