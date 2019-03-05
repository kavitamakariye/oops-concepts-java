package polymorphismDriver;

import polymorphism.ContractEmployee;
import polymorphism.Employee;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new ContractEmployee();
		ContractEmployee cemp = new ContractEmployee();
		ContractEmployee cemp1 = new ContractEmployee();
		emp.getClass();
		emp1.getSalary();
		cemp1.getSalary();//Employee getsalary method
		cemp.getsalary();//Contract employee getsalary method

	}
}
