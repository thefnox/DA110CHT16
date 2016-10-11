package lecture7;

import java.util.Scanner;

public class Task6 extends Task {

	public Task6(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	private class Person{
		String name;
		int age;
		
		public Person(String name, int age){
			this.name = name;
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
		Person person = new Person("Fernando", 23);
		Person person2 = new Person("Claudia", 25);
		
		System.out.printf("We have two people, %s, age %d and %s, age %d\n", person.getName(), person.getAge(), person2.getName(), person2.getAge());
	}
	
	
	

}
