package exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 extends Task {

	public Task4(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public int smallest(ArrayList<Integer> list){
		int min = Integer.MAX_VALUE;
		for(int x : list){
			if (x < min){
				min = x;
			}
		}
		return min;
	}
	
	public int largest(ArrayList<Integer> list){
		int max = Integer.MIN_VALUE;
		for(int x : list){
			if (x > max){
				max = x;
			}
		}
		return max;
	}
	
	public double average(ArrayList<Integer> list){
		double sum = 0.0;
		for (int x : list){
			sum += (double) x;
		}
		return sum / (double) list.size();
	}
	
	public void execute(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int x;
		do {
			System.out.print("Enter next integer to put in the list, 0 to stop: ");
			x = scan.nextInt();
			if (x != 0) list.add(x);
		}
		while (x != 0);
		System.out.printf("The smallest number is %d, the largest number is %d, and the average is %.5f\n", smallest(list), largest(list), average(list));
	}

}
