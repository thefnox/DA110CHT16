package exercise5;

import java.util.Scanner;

public class Task1 extends Task {

	public Task1(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public void execute(){
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		for (String s : months){
			if (s.equals("July")){
				System.out.println("July, also this is the best month ok?");
			}
			else
			{
				System.out.println(s);
			}
		}
	}

}
