package lecture3;

public class Task5 extends Task{
	public Task5()
	{
		char c = 'a';
		short sh = 5;
		int i = 100000;
		long l = 1000000000;
		float f = 1.0555f;
		double d = 1.05352345;
		byte b = 2;
		boolean bo = false;
		System.out.println(c);
		System.out.println(sh);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(bo);
		System.out.printf("All variables, %c, %h, %d, %d, %f, %f, %b, %s", c, sh, i, l, f, d, b, new Boolean(bo).toString() );
	}
}
