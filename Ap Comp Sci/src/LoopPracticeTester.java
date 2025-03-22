import java.util.Scanner;

public class LoopPracticeTester {

	public static void main(String[] args) {

			Scanner in = new Scanner (System.in);
			System.out.println("Chose a number you want to approxiamate pi");
			int m=in.nextInt();
			LoopPractice loop=new LoopPractice();
			System.out.println("The digits of pi are ");
			System.out.println(loop.piApprox(m));

	}

}
