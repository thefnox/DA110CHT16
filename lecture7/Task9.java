package lecture7;

import java.util.Scanner;

public class Task9 extends Task {
	
	enum Months{
		January,
		February,
		March,
		April,
		May,
		June,
		July,
		August,
		September,
		October,
		November,
		December
	}
	
	private class Person{
		private String motto;
		private String name;
		private int age;
		private Months month;
		
		public Person(String name, int age, String motto, Months month){
			this.name = name;
			this.age = age;
			this.motto = motto;
			this.month = month;
		}
		
		public String getName(){
			return name;
		}
		
		public int getAge(){
			return age;
		}
		
		public Months getMonth(){
			return month;
		}
		
		public String getMotto(){
			return motto;
		}
		
		public void printMotto(){
			System.out.printf("%s's motto is \"%s\"\n", name, motto);
		}
	}

	public Task9(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public void execute(){
		Person person = new Person("Fernando", 23, "Don't eat stuff from the ground", Months.July);
		System.out.printf("Person %s has age %d, motto %s and was born on month %s\n", person.getName(), person.getAge(), person.getMotto(), person.getMonth().toString());
	}

}
