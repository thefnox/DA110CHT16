package lecture7;

import java.util.Scanner;

public class Task7 extends Task {

	public Task7(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	private class Person{
		private String motto;
		private String name;
		private int age;
		
		public Person(String name, int age, String motto){
			this.name = name;
			this.age = age;
			this.motto = motto;
		}
		
		public String getName(){
			return name;
		}
		
		public int getAge(){
			return age;
		}
		
		public void printMotto(){
			System.out.printf("%s's motto is \"%s\"\n", name, motto);
		}
	}
		
	public void execute(){
		Person person = new Person("Fernando", 23, "Don't eat stuff from the ground");
		Person person2 = new Person("Claudia", 25, "Always trust yourself");
		
		System.out.printf("We have two people, %s, age %d and %s, age %d\n", person.getName(), person.getAge(), person2.getName(), person2.getAge());
		person.printMotto();
		person2.printMotto();
	}
		

}
