
public class Marathoner extends Runner
{
    
	public Marathoner(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public void race (double runLength)
	{
		if (runLength>=10)
		{
            super.race(runLength);
		}
		else
		{
			
            super.train(runLength*8.5/60);
		}
	}
}
