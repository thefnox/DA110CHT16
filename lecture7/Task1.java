package lecture7;

import java.util.Scanner;

public class Task1 extends Task {

	public Task1(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	private class A{
		public void fooBar(){
			System.out.println("Hello world!");
		}
	}
	
	private class B extends A{
		
	}

	
	public void execute(){
		B obj = new B();
		obj.fooBar();
	}

}
