package exercise5;

import java.util.Scanner;

public class Task3 extends Task {

	public Task3(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public String printArray(int[] arr){
		String s = "[";
		for (int i = 0; i < arr.length; i++){
			if (i == 0){
				s += arr[i];
			}
			else{
				s += ", " + arr[i];
			}
		}
		return s + "]";
	}
	
	public int smallestDistance(int[] arr){
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length - 1; i++){
			int current = Math.abs(arr[i] - arr[i + 1]);
			if (current < min){
				min = current;
			}
		}
		return min;
	}
	
	public void execute(){
		int[] array = {5, 8, 9, 27};
		System.out.printf("The smallest distance in the array %s is %d\n", printArray(array) ,smallestDistance(array));
	}
}
