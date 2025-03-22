import java.util.ArrayList;
import java.util.Random;

public class NumberShifter {
	
	public static int[] makeLucky7Array( int size)
	{
		Random generator=new Random();
		int [] array=new int[size];
		for (int i=0; i<size;i++)
		{
			array[i]=generator.nextInt(10)+1;
		}
		return array;
		
	}
	
	public static void shiftEm(int[] array)
 {
	 ArrayList<Integer> temp= new ArrayList<Integer>();
	 for (int i=0; i<array.length;i++)
	 {
		 if (array[i]==7)
		 {
			 temp.add(0, array[i]);
		 }
		 else
		 {
			 temp.add(array[i]);
		 }
	 }
	 for (int i=0; i<array.length;i++)
	 {
		 array[i]=temp.get(i);
	 }
 }
 
}
