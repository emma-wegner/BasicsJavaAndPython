import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class NumberShifterRunner
{
	public static void main( String args[] )
	{
		 
		NumberShifter shift= new NumberShifter();
		int ray[]=shift.makeLucky7Array(20);
		System.out.println(Arrays.toString(ray));
		shift.shiftEm(ray);
		System.out.println(Arrays.toString(ray));
		 
	}
}
