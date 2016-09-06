package lecture3;

import java.util.Scanner;

public class Task11 extends Task {
	
	public Task11(){
		Person person = new Person();
		System.out.printf("This person's name is %s, age %d\n", person.getName(), person.getAge());
		System.out.println("Enter new name and age");
		Scanner scan = new Scanner(System.in);
		person.setName(scan.next());
		person.setAge(scan.nextInt());
		System.out.printf("This person's name is now %s, age %d\n", person.getName(), person.getAge());
	}
}
