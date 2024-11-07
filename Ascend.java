// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		double lim = Double.parseDouble(args[0]);
		int a,b,c;
		a = (int)(lim*Math.random());
		b = (int)(lim*Math.random());
		c = (int)(lim*Math.random());
		System.out.println(a + " " + b + " " + c);
		int min, mid, max;
		min = Math.min(a,b);
		min = Math.min(min,c);
		max = Math.max(a,b);
		max = Math.max(max,c);
		int sum = a+b+c;
		mid = sum-max-min;
		System.out.println(min + " " + mid + " " + max);
	}
}
