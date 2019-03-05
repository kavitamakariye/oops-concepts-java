package polymorphism;

public class ContractEmployee extends Employee{

	public float getsalary() {
		System.out.println("Contract Employee Salary");
		return salary;
	}
}
