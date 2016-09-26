package exercise4;

import java.util.Scanner;

public class Task7 extends Task {
	
	//Using sieve of Erathostenes
	//If you don't know what that is
	//Google it, it's fun.
	
	public boolean[] notPrimes;
	
	void calculatePrimes(){
		notPrimes = new boolean[2000000];
		int max = (int) Math.sqrt(2000000.0);
		int i, j;
		notPrimes[0] = true;
		notPrimes[1] = true;
		for (i=2; i<max; i++){
			if (notPrimes[i]) continue;
			for (j=i*2; j<2000000; j+=i){
				notPrimes[j] = true;
			}
		}
	}

	public Task7(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public void execute(){
		calculatePrimes();
		System.out.print("Enter amount of primes to print: ");
		int i, j;
		i = scan.nextInt();
		j = 2;
		System.out.println("Primes: ");
		while (i>0){
			if (!notPrimes[j]){
				System.out.println(j);
				i--;
			}
			j++;
		}
	}

}
