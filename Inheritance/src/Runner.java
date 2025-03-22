
public class Runner extends Athlete
{
    private int myNumberOfRaces;
    private double myMilesRaced;
    
	public Runner(String firstName, String lastName) {
		super(firstName, lastName, "Running");
		myNumberOfRaces=0;
		myMilesRaced=0;
	}
	
	public void race (double raceLength)
	{
		System.out.println(getName()+ " is racing in a "+raceLength+" mile race.");
		myNumberOfRaces++;
		myMilesRaced+=raceLength;
	}
	
	public int getRaces()
	{
		return myNumberOfRaces;
	}
	
	public double getMilesRaced()
	{
		return myMilesRaced;
	}

}
