
public class Athlete {
     private String myFirstName;
     private String myLastName;
     private String mySport;
     private double myHoursTraining;
	public Athlete (String firstName, String lastName, String sportPlayed)
 {
		myFirstName=firstName;
		myLastName=lastName;
		mySport=sportPlayed;
		myHoursTraining=0;
 }
	public void train (double hours)
	{
		System.out.println("Athlete training for "+hours+ " hours.");
		myHoursTraining+=hours;
	}
	
	public String getName()
	{
		return (myFirstName + " "+ myLastName);
	}
	
	public String getSport()
	{
		return mySport;
	}
	
	public double getHoursTrained()
	{
		return myHoursTraining;
	}
}
