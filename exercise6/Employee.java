package exercise6;

public class Employee extends Person {
	
	private int salary = 0;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary < 0){
			System.out.println("Salary cannot be negative.");
			return;
		}
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
