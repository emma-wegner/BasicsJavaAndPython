import java.util.ArrayList;

 
public class Actors extends Celebrity
{
	/**
	 * The list of clues for the Literature Celebrity. They can be titles of texts, important characters, settings, etc...s
	 */
	private ArrayList<String> clueList;
	private ArrayList<String> showsList;
   String shows; 	
   int numberOfAwards;
   boolean hasOscars;
	public Actors(String answer, String clues, String s, int a, boolean o)
	{
		super(answer, clues);
		shows=s;
		numberOfAwards=a;
		hasOscars=o;
	}
	
	/**
	 * Processes the series of clues for the LiteratureCelebrity by adding all the values to an ArrayList<String> by
	 * splitting the original clue to an array of String.
	 * The original value is not impacted, thus preserving data and inheritance integrity.
	 */
	private void processClues()
	{
		String [] clues = super.getClue().split(",");
		clueList = new ArrayList<String>();
		for (String currentClue : clues)
		{
			clueList.add(currentClue);
		}
		String [] shows = super.getClue().split(",");
		showsList = new ArrayList<String>();
		for (String currentShow : shows)
		{
			clueList.add(currentShow);
		}
		clueList.add("The actor/actress has :"+getNumberOfAwards()+" of awards.");
		if (isHasOscars())
		{
		clueList.add("The actor/actress has won an oscar.");
		}
		else
		{
		clueList.add("The actor/actress has not won an oscar.");
		}
	}
	
	/**
	 * Overridden version of the getClue() method that cycles through each of the individual clues in the series.
	 * It recreates the clueList if the user has finished the series of clues.
	 */
	@Override
	public String getClue()
	{
		if (clueList.size() == 0)
		{
			processClues();
		}
		String currentClue = clueList.remove(0);
		
		return currentClue;
	}
	

	public String getShows() {
		return Shows;
	}

	public void setShows(String shows) {
		Shows = shows;
	}

	public int getNumberOfAwards() {
		return numberOfAwards;
	}

	public void setNumberOfAwards(int numberOfAwards) {
		this.numberOfAwards = numberOfAwards;
	}

	public boolean isHasOscars() {
		return hasOscars;
	}

	public void setHasOscars(boolean hasOscars) {
		this.hasOscars = hasOscars;
	}

	@Override
	public String toString()
	{
		String dsc = "This is the actor: " + super.getAnswer() + "\nThe clues are:\n";
		
		for (String word : super.getClue().split(","))
		{
			dsc += word + "\n";
		}
		
		return dsc;
	}

}
