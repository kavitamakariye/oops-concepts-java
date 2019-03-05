package inheritanceDriver;

import inheritance.ContractEmployee;
import inheritance.Employee;
import inheritance.FullTimeEmployee;
import inheritance.ManagerEmployee;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Employee emp1 = new FullTimeEmployee();
		Employee emp2 = new ContractEmployee();
		Employee emp3 = new ManagerEmployee();
		FullTimeEmployee femp = new FullTimeEmployee();
	  //FullTimeEmployee fmp1 = new Employee(); //We cannot assign parent class object to child class reference variable
		FullTimeEmployee femp2 = new ManagerEmployee();
		ContractEmployee cemp = new ContractEmployee();
	  //ContractEmployee cemp1 = new Employee();//We cannot assign parent class object to child class reference variable.
		ManagerEmployee memp = new ManagerEmployee();
	  //ManagerEmployee memp1 = new FullTimeEmployee();//We cannot assign parent class object to child class reference variable.
	  //ManagerEmployee memp2 = new Employee();//We cannot assign parent class object to child class reference variable.
	}
}
