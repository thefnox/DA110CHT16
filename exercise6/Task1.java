package exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 extends Task {

	public Task1() {
		// TODO Auto-generated constructor stub
	}
	
	public Task1(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public void execute(){
		Person person1 = new Person();
		Person person2 = new Person();
		ArrayList<Person> list = new ArrayList<Person>();
		person1.setName("Fernando");
		person1.setAddress("Fältvägen 5");
		person1.setPhoneNumber(0732453670);
		person1.setSSN("199307162322");
		person2.setName("Claudia");
		person2.setAddress("UK");
		person2.setPhoneNumber(325184142);
		person2.setSSN("");
		list.add(person1);
		list.add(person2);
		for (Person person : list){
			System.out.printf("Person information: Name = %s, Address = %s, Phone Number = %d, SSN = %s\n", person.getName(), person.getAddress(), person.getPhoneNumber(), person.getSSN());
		}
	}

}
