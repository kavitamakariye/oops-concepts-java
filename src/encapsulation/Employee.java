package encapsulation;

public class Employee {

	private String eName;
	private int eID;
	String department;
	
	public String getName() {
		return eName;
	}
	public void setName(String eName) {
		this.eName = eName;
	}
	
	private String getDepartment() {
		return department;
	}
	private void setDepartment(String department) {
		this.department = department;
	}
	
}
