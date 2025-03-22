import java.util.Scanner;

public class NumberFactsTester {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

	      System.out.println("This program puts 3 words in alphabetical order ");

	      System.out.println("Enter in a number: ");

	      int one = in.nextInt();

	      NumberFacts newNumber = new NumberFacts(one);
	      
	      System.out.println("Value :"+newNumber.getValue());
	      System.out.println("Sum of Ints :"+newNumber.sumInts());
	      System.out.println("Find Factorials :"+newNumber.findFactorial());
	      System.out.println("Get Factors :"+newNumber.getFactors());
	      System.out.println("Is Prime :"+newNumber.isPrime()); 
	      System.out.println("Number Digits :"+newNumber.findNumberOfDigits());
	      System.out.println("Sum of Digits :"+newNumber.findSumOfDigits());
	      System.out.println("Is perfect: "+newNumber.isPerfect());
	}

}
