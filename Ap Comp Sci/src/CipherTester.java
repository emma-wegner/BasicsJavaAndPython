import java.util.Scanner;

public class CipherTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	     String str="";
       
	    TopLeftColumnRow code=new TopLeftColumnRow();

		  System.out.println("Please enter a String: ");
		  str=in.nextLine();

	      System.out.println(code.encode(str));
	      System.out.println(code.decode(code.encode(str)));
	}
}
