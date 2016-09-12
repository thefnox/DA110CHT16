package lecture4;

public class Task6 extends Task {
	public Task6(){
		int count, i;
		System.out.println("For loop:");
		count = 0;
		for (i=0; i<10; i++){
			System.out.printf("\t%d: Hello world.\n", count + 1);
			count++;
		}
		System.out.println("While loop:");
		count = 0;
		i = 0;
		while (i++ < 10){
			System.out.printf("\t%d: Hello world.\n", count + 1);
			count++;
		}
		System.out.println("Do while loop");
		count = 0;
		i = 1;
		do
		{
			System.out.printf("\t%d: Hello world.\n", count + 1);
			count++;	
		}
		while (i++ < 10);
	}
}
