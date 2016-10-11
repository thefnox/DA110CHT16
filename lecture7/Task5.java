package lecture7;

import java.util.Scanner;

public class Task5 extends Task {

	public Task5(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}

	private class Person{
		String name;
		int age;
		
		public void setName(String name){
			this.name = name;
		}
		
		public void setAge(int age){
			this.age = age;
		}
		
		public String getName(){
			return name;
		}
		
		public int getAge(){
			return age;
		}
	}
	
	public void execute(){
		Person person = new Person();
		person.setName("Fernando");
		person.setAge(23);
		
		Person person2 = new Person();
		person2.setName("Claudia");
		person2.setAge(25);
		
		System.out.printf("We have two people, %s, age %d and %s, age %d\n", person.getName(), person.getAge(), person2.getName(), person2.getAge());
	}
	
}
