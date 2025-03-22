import java.util.Scanner;

public class GreeterPrinter {
	public static void main(String[] args) {
		
		System.out.println("What's your name?");
		Scanner in = new Scanner(System.in);
        String myName=in.nextLine();
        Greeter greet= new Greeter(myName);
        System.out.println(greet.greeting());
        System.out.println(greet.goodbye());
        
	}
}
