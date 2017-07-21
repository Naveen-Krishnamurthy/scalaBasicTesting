class StudentClass(cnstRegNo:Int,cnstStdName:String) {
	val regNo=cnstRegNo; val stdName=cnstStdName;

	def printStdDetails() {
		println("The Student ->"+cnstStdName+"<- having register number ->"+regNo+"<-");
	}
}

object Girish{
	def main(args:Array[String]) {
		val StudentClass=new StudentClass(223,"Girish Krishnamurthy");
		StudentClass.printStdDetails();
	}
	
}