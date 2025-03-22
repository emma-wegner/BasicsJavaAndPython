//package mainpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RationalTester
{
	public static void main(String[] args)
	{
		ArrayList<Rational> a, b;
		
		System.out.println("Constructor test...");
		
		a = new ArrayList<>();
		a.add(new Rational(2, 4));
		a.add(new Rational(16, 6));
		a.add(new Rational(13, -65));
		a.add(new Rational(2, 0));
		a.add(new Rational(-14, 49));
		a.add(new Rational(0, 2));
		
		System.out.println("Tested:   " + a
				+ "\nExpected: [1/2, 8/3, -1/5, 2/1, -2/7, 0/1]");
		
		System.out.println("\n" + "compareTo() test...");
		b = new ArrayList<>(a);
		//Collections.sort(b);
		System.out.println("Tested:   " + b
				+ "\nExpected: [-2/7, -1/5, 0/1, 1/2, 2/1, 8/3]");
		
		System.out.println("\n" + "Reciprocal test...");
		b = new ArrayList<>();
		for (int i = 0; i < a.size(); i++)
			b.add(a.get(i).getReciprocal());
		System.out.println("Tested:   " + b
				+ "\nExpected: [2/1, 3/8, -5/1, 1/2, -7/2, 1/1]");
		
		System.out.println("\n" + "Addition test...");
		b = new ArrayList<>();
		for (int i = 0; i < a.size(); i++)
			b.add(a.get(i).add(new Rational(1, 12)));
		System.out.println("Tested:   " + b
				+ "\nExpected: [7/12, 11/4, -7/60, 25/12, -17/84, 1/12]");
		
		System.out.println("\n" + "Subtraction test...");
		b = new ArrayList<>();
		for (int i = 0; i < a.size(); i++)
			b.add(a.get(i).subtract(new Rational(1, 7)));
		System.out.println("Tested:   " + b
				+ "\nExpected: [5/14, 53/21, -12/35, 13/7, -3/7, -1/7]");
		
		System.out.println("\n" + "Multiplication test...");
		b = new ArrayList<>();
		for (int i = 0; i < a.size(); i++)
			b.add(a.get(i).multiply(new Rational(-3, 2)));
		System.out.println("Tested:   " + b
				+ "\nExpected: [-3/4, -4/1, 3/10, -3/1, 3/7, 0/1]");
		
		System.out.println("\n" + "Division test...");
		b = new ArrayList<>();
		for (int i = 0; i < a.size(); i++)
			b.add(a.get(i).divide(new Rational(-3, 2)));
		System.out.println("Tested:   " + b
				+ "\nExpected: [-1/3, -16/9, 2/15, -4/3, 4/21, 0/1]");
	}
}

