import java.util.ArrayList;

public class LineTester
{
	

	public static void main(String[] args)
	{
		Line line1 = new Line(0, 3); //y=3
		Line line2 = new Line(4, 3, -2, 3); //y=3
		Line line3 = new Line(1); //x=1
		Line line4 = new Line(-1, -2, 4); //y = 4x+2
		Line line5 = new Line(0); //x=0
		Line line6 = new Line(0, 8, -4, -8); //y=4x+8
		Line line7 = new Line(0.3, 2); //y=0.3x+2
		
		System.out.println(line1.intersects(line4) + " = true?");
		System.out.println(line2.intersects(line4) + " = true?");
	   System.out.println(line6.intersects(line7) + " = true?");
		System.out.println(line3.intersects(line5) + " = false?"); //tricky
		System.out.println(line3.isParallel(line5) + " = true?"); //tricky
		System.out.println(line1.isParallel(line3) + " = false?");
		System.out.println(line1.isParallel(line2) + " = false?"); //tricky - needed to fix from given tester
		System.out.println(line4.isParallel(line6) + " = true?");
		System.out.println(line1.equals(line2) + " = true?");
		System.out.println(line2.equals(line4) + " = false?");
		System.out.println(line3.equals(line5) + " = false?"); //tricky
		System.out.println(line4.equals(line7) + " = false?");
		System.out.println(line4.equals(line6) + " = false?");
		
	}

}
