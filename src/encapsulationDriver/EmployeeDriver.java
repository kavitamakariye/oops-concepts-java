package encapsulationDriver;

import encapsulation.Employee;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setName("Monica");
		System.out.println(e.getName());
		//System.out.println(e.eId=1); //does not allow to assign value to eID as it is private and does not have public getter and setter
		//e.setdepartment(); //does not allow to access the getter and setter of department, as private methods are not accessible outside the class
	}
}
