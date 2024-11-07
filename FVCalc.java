// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]); //current value
		double rate = Double.parseDouble(args[1]); //rate - gets string and parse to double
		int years = Integer.parseInt(args[2]); //years - gets string and parse to int
		double futureValue = (currentValue*(Math.pow((1+rate), years)));
		System.out.println("After " + years + " years, a $" + currentValue + " saved at " + rate + "% will yield $" + ((int)futureValue)/100);
	}
}