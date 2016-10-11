package lecture7;

import java.util.Scanner;

class MyMath{
	public static double calculateCube(double side){
		return side * side * side;
	}
}

public class Task2 extends Task {

	public Task2(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public void execute(){
		double side = 0.5;
		System.out.printf("The area of a cube of width %.2f meters is %.2f cubic meters\n", side, MyMath.calculateCube(side));
	}
}
