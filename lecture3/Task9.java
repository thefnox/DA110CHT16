package lecture3;

import java.util.Scanner;

public class Task9 extends Task {
	public Task9(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me your name");
		String name = scan.nextLine();
		String givenname = name.split(" ")[0];
		String familyname = name.split(" ")[1];
		System.out.print(name + "\n");
		System.out.println(name);
		System.out.format("%s %s\n", givenname, familyname);
		System.out.printf("%s %s\n", givenname, familyname);
	}
}
