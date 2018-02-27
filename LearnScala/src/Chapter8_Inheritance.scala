/**
  * Created by MacUser on 25/10/17.
  */
class Employee {

  val name : String = null
  val age : Int = 0

  def displayInformation: Unit = {
    println("This is in superclass")
  }

}
class Manager extends Employee {
  override val name: String = "NewManager"
  override val age: Int = 21
  override def displayInformation: Unit = {
    println(super.toString)
    super.displayInformation
    println("Name is :"+name)
    println("Age is :"+age)
  }
}

class TechLead extends Employee {
  override val name: String = "TechLead"
  override val age: Int = 33
  override def displayInformation: Unit = {
    println(super.toString)
    println("Without super class method")
    println("Name is :"+name)
    println("Age is :"+age)
  }

}

object testInheritance {
  def main(args: Array[String]): Unit = {
    val techLead = new TechLead
    val manager = new Manager
    println("Display Information of manager")
    manager.displayInformation
    println("Display information of Tech lead")
    techLead.displayInformation

    println("Tech Lead is instance of Employee :"+techLead.isInstanceOf[Employee])
    println("Tech Lead is instance of Manager :"+techLead.isInstanceOf[Manager])
    techLead.asInstanceOf[Manager]


  }
}

