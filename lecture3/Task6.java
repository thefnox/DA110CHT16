package lecture3;

import java.util.Scanner;

public class Task6 extends Task {
	public Task6(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers with decimal part: ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		int res = (int) ((int) x + y);
		double res2 = x + y;
		System.out.printf("Result as int is %d, result as double is %f", res, res2);
	}
}
