package exercise4;

import java.util.Scanner;

public class Task6 extends Task {

	public Task6(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public void bad(){
		bad();
	}
	
	public void execute(){
		System.out.print("This will cause a stack overflow, brace for it!");
		bad();
	}
}
