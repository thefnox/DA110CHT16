package exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 extends Task {

	public Task2() {
		// TODO Auto-generated constructor stub
	}

	public Task2(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public void execute(){
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		ArrayList<Employee> list = new ArrayList<Employee>();
		employee1.setName("Fernando");
		employee1.setAddress("Fältvägen 5");
		employee1.setPhoneNumber(2141231);
		employee1.setSSN("9307162321");
		employee2.setName("Claudia");
		employee2.setAddress("UK");
		employee2.setPhoneNumber(011231313);
		employee2.setSSN("");
		employee1.setSalary(100);
		employee2.setSalary(-100);
		list.add(employee1);
		list.add(employee2);
		for (Employee person : list){
			System.out.printf("Person information: Name = %s, Address = %s, Phone Number = %d, SSN = %s, Salary = %d\n", person.getName(), person.getAddress(), person.getPhoneNumber(), person.getSSN(), person.getSalary());
		}
	}

}
