
import java.util.ArrayList;
import java.util.Random;

/* Name: Brian Diomede
*  Date: Nov 27, 2017
*  Program Name: FooList.java
*  Description: Description
*/

public class FooList
{
    /**
     * Constructor implementation initializes
     * fooLength (the length of the strings in FooList's list) and
     * possibleFoos (FooList's list of strings.
     */
    //constructor goes here
	public FooList()
	{
		possibleFoos= new ArrayList<String>();
		fooLength=0;
	}
    /**
     * Returns true if the string, key, is found in
     * the FooList's list of strings, false otherwise.
     * @param key the string we are searching for
     * @return true if key is found in FooList; false otherwise
     */
    public boolean found(String key)
    {
    	for (int r=0; r<possibleFoos.size(); r++)
    	{
 
    			if(possibleFoos.get(r).equals(key))
    			{
    				return true;
    			}
    	}
		return false;
        //Code goes here
    }
    /**
     * Adds the string, entry, to FooList's implementation if
     * it is the correct length and not already in the list. If the
     * string is already in the list or if the string is not the 
     * correct length, it is not added.
     * @param entry string to add to FooList
     */
    public void addFoo(String entry)
    {
      
    	for(int i=0; i<possibleFoos.size();i++)
       {
    	   if(possibleFoos.get(i).equals(entry))
			{
			  same=true;
			}
       }
    	if(!same)
    	{
    		if(entry.length()==fooLength)
    		{
    			possibleFoos.add(entry);
    		}
    	}
    }
 
    /**
     * Removes and returns a random string entry from FooList's
     * list of strings.
     * @return a random string from FooList
     */
    public String removeFoo()
    {
       Random shuffle= new Random();
       int m=shuffle.nextInt(possibleFoos.size()-1);
       String i=possibleFoos.get(m);
       possibleFoos.remove(m);
       return i;
    }
    /**
     * Returns the string in position i of FooList's list 
     * implementation. The first string is in position 0.
     * @return the ith entry in FooList
     */
    public String getFoo(int i)
    {
        return possibleFoos.get(i);
    }
    /**
     * Gets the length of a string in FooList.
     * @returns length of the individual strings in FooList
     */
     
    public int getFooLength()
    {
        return fooLength;
    }
    
    public void setFooLength(int fooLength) {
		this.fooLength = fooLength;
	}
	public int getpossibleFoosSize()
    {
    	return possibleFoos.size();
    }

    private int fooLength;
    private ArrayList<String> possibleFoos;
    private boolean same=false;
}

