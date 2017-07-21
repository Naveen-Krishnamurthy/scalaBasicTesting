class CompanyDB {
	var employeeID:Long=0;
	var employeeName:String=null;

	//Method Overloading in differnt class
	def setEmployeeDetails(empID:Long,empName:String) {
		employeeID=empID ; employeeName=empName
	}

	//Method overriding in different class
	def printEmployeeDetails() {
		println("Name of the employee :"+employeeName)
		println("ID Number :"+employeeID)
	}
}

class TechCompanyDB extends CompanyDB {
	var employeeDOB:String=null;

	def setEmployeeDetails(empDOB:String) {
		employeeDOB=empDOB;
	}

	override def printEmployeeDetails() {
		println("Employee DOB is :"+employeeDOB);
	}


}


object employDataBase {
	def main(args:Array[String]) {
		// var employee1=new CompanyDB();
		// employee1.setEmployeeDetails(5013505317L,"Naveen Krishnamurthy")
		// employee1.printEmployeeDetails();

		var employeeDOB=new TechCompanyDB();
		employeeDOB.setEmployeeDetails("10/11/1988");
		employeeDOB.printEmployeeDetails();
	}
}