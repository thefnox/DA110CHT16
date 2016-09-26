package exercise4;

import java.util.Scanner;

public class Task2 extends Task {

	public Task2(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public double kiloToPound(double kilo){
		return kilo * 2.20462;
	}
	
	public double meterToFeet(double meter){
		return meter * 3.28084;
	}
	
	public void execute(){
		System.out.print("Give me an amount in kilograms: ");
		double x = scan.nextDouble();
		System.out.printf("%.2f kg is %.2f pounds\n", x, kiloToPound(x));
		System.out.print("Give me a distance in meters: ");
		x = scan.nextDouble();
		System.out.printf("%.2f meters is %.2f feet\n", x, meterToFeet(x));
	}

}
