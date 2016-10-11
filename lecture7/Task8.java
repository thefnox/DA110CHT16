package lecture7;

import java.util.Scanner;

public class Task8 extends Task {

	public Task8(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	private class Person{
		protected String motto;
		protected String name;
		protected int age;
		
		public Person(){
			
		}
		
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
	
	private class Student extends Person{
		private char grade;
		
		public Student(String name, int age, String motto, char grade){
			this.name = name;
			this.age = age;
			this.motto = motto;
			this.grade = grade;
		}
		
		public void setGrade(char grade){
			this.grade = grade;
		}
		
		public char getGrade(){
			return this.grade;
		}
		
		public String toString(){
			return "{Name = " + this.name + ", Age = " + this.age + ", Motto = " + this.motto + ", Grade = " + this.grade + "}";
		}
	}
	
	public void execute(){
		Student student = new Student("Fernando", 23, "Don't eat stuff from the ground", '5');
		System.out.println(student);
	}

}
