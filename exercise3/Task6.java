package exercise3;

import java.util.Scanner;

public class Task6 extends Task {
	public Task6(){
		Scanner scan = new Scanner(System.in);
		int i, n, sum = 0, avg = 0, min = Integer.MAX_VALUE, max = 0, total = 0, loops = 0;
		while (true){
			loops++;
			System.out.print("Enter your number, 0 to exit: ");
			sum = 0;
			n = scan.nextInt();
			if (n == 0) break;
			for (i = 1; i<=n; i++){
				sum += i;
			}
			total += sum;
			if (sum < min) min = sum;
			if (sum > max) max = sum;
			avg = total / loops;
			System.out.printf("Sum from 1 to %d = %d, current min. = %d, current max.= %d, current average= %d\n",n, sum, min, max, avg );
		}
			
	}
}
