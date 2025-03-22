import java.util.Scanner;

public class TrianglePrinter {

	public static void main(String[] args) {
		//variables
		
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		String triangle="";
		//scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println("Choose your triangle 2 write which type you want make  "
				+ "scalene, isosceles, equilateral, rightIsosceles ");
		 System.out.println("or rightScalene. Make sure to write in Camel Case. ");
		triangle=in.next();
		
		System.out.println("Hello please enter one triangle sides");
		
		
		a=in.nextInt();
		System.out.println("Enter another");
		b=in.nextInt();
		System.out.println("Enter another");
		c=in.nextInt();
		
		
		
		Triangle tri= new Triangle( a, b,c, d, e, f); 
		
		System.out.println("Your triangle is a "+tri.noTriangle()+" triangle.");
        if (tri.noTriangle()==true)
        {
		if (tri.equilateral()==true)
		{
		System.out.println("Your triangle is an equilateral");	
		}
		else if (tri.isosceles()==true)
		{
			System.out.println("Your triangle is an isosceles");		
		}
		else
		{
			System.out.println("Your triangle is scalene");
		}
        }
		
		//Part B
		
		if (triangle.equalsIgnoreCase("equilateral"))
		{
			tri.makeEquilateral();
			System.out.println("Your triangle 2 sides are " +tri.triangle2One+", " +tri.triangle2Two+", "+tri.triangle2Three+".");
		}
		
	    if (triangle.equalsIgnoreCase("isosceles"))
		{
			tri.makeIscosceles();
			System.out.println("Your triangle 2 sides are " +tri.triangle2One+", " +tri.triangle2Two+", "+tri.triangle2Three+".");
		}
		if (triangle.equalsIgnoreCase("scalene"))
		{
			tri.makeScalene();
			System.out.println("Your triangle 2 sides are " +tri.triangle2One+", " +tri.triangle2Two+", "+tri.triangle2Three+".");
		}
		
		if (triangle.equalsIgnoreCase("rightScalene"))
		{
			tri.makeRightScalene();
			System.out.println("Your triangle 2 sides are " +tri.triangle2One+", " +tri.triangle2Two+", "+tri.triangle2Three+".");
		}
		
		if (triangle.equalsIgnoreCase("rightIsosceles"))
		{
			tri.makeRightIsosceles();
			System.out.println("Your triangle 2 sides are " +tri.triangle2One+", " +tri.triangle2Two+", "+tri.triangle2Three+".");
		}
		
		
		
	}

}
