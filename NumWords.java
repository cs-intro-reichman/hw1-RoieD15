// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int digits = num%10;
		int tens = ((num-digits%10)%100)/10;
		int hundreds = (num-(num%100))/100; 
		//done
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + digits + " ones.");
	}
}
