package exercise4;

import java.util.Scanner;

public class Task1 extends Task {

	public Task1(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	int smallest(int a, int b, int c){
		int x;
		if (a < b){
			x = a;
		}
		else
		{
			x = b;
		}
		if (c < x){
			return c;
		}
		return x;
	}
	
	int largest(int a, int b, int c){
		int x;
		if (a > b){
			x = a;
		}
		else
		{
			x = b;
		}
		if (c > x){
			return c;
		}
		return x;
	}
	
	double average(int a, int b, int c){
		return (double) (a + b + c) / 3.0;
	}
	
	int sum(int a, int b, int c){
		return a + b + c;
	}
	
	public void execute(){
		System.out.print("Give me three numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.printf("The smallest of all numbers is %d, the largest is %d, the average is %.2f and the sum is %d", smallest(a, b, c), largest(a, b, c), average(a, b, c), sum(a, b, c));
	}

}
