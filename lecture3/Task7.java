package lecture3;

public class Task7 extends Task{
	public Task7(){
		int i = 0;
		while (i < 10) i = i + 1;
		int j = 0;
		while (j++ < 10) { }
		// j will be equal to 11 despite iterating 10 times as it increases in the last iteration
		j--;
		int k = 0;
		while ((k+=1) < 10) { }
		if (i == j && j == k)
			System.out.println("Same result");
		else
			System.out.println("Different results");
	}
}
