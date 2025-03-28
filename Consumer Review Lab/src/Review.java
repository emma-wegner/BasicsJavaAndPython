import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
 
  
  private static final String SPACE = " ";
  
  static{
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        //System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }
  
    /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }
    
    return word;
  }
  
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }
  
  public static double totalSentiment (String fileName)
  {
	String text= textToString(fileName);
	int lastSpace=0;
	String word= "";
	double totalSent=0;
	  for (int i=0; i<text.length();i++)
	{
		int ascii=(int)text.charAt(i);
		if (!(ascii>=65&&ascii<=90)||!(ascii>=97)&&(ascii<=122))
		{
			if (lastSpace==0)
			{
				lastSpace=-1;
			}
			int newSpace=i;
			word=text.substring(lastSpace+1, newSpace);
			totalSent+=sentimentVal(word);
			
		}
		else if (i==text.length()-1)
		{
			word=text.substring(lastSpace+1);
			totalSent+=sentimentVal(word);
		}
		
	}
	  return totalSent;
   } 
  

  
  public static int starRating(String fileName)
  {
	  double totalSentiment=totalSentiment(fileName);
	  if(totalSentiment>=15)
	  {
		  return 5;
	  }
	  else if(totalSentiment<0)
	  {
		  return 1;
	  }
	  else if(totalSentiment<5)
	  {
		  return 2;
	  }
	  else if(totalSentiment<10)
	  {
		  return 3;
	  }
	  else if(totalSentiment<15)
	  {
		  return 1;
	  }
	  else
	  {
		  return 0;
	  }
  }
  
     public static String fakeReview(String fileName)
    {
	  String text= textToString(fileName);
	  String fakeReview= "";
	  fakeReview=text;
	  boolean startOfAdjective=false;
	  int startOfAdjectiveInt=0;
	  String m;
	  for (int i=0; i<text.length();i++)
	  {
		  if (text.substring(i,i+1).equals("*"))
		  {
			  startOfAdjective=true;
			  startOfAdjectiveInt=i;
		  }
		  else if (startOfAdjective)
		  {
			     if(i==text.length()-1)
					{
					do
			    	 {
			    		m=randomPositiveAdj();
			    	 } while(Review.sentimentVal(m)>1);
			    	 fakeReview=fakeReview.substring(0,startOfAdjectiveInt)+m+" "+fakeReview.substring(i+1);
					   startOfAdjective=false;
					}

			  if (text.substring(i,i+1).equals(" ")||text.substring(i,i+1).equals(","))
				{
				  do
			    	 {
			    		m=randomPositiveAdj();
			    	 } while(Review.sentimentVal(m)>1);
				  fakeReview=fakeReview.substring(0,startOfAdjectiveInt)+m+" "+fakeReview.substring(i);
				   startOfAdjective=false;
				}
		  }
		
	  }
	  return fakeReview;
    }
     public static boolean characterTester()
     {
    	 String hi= "he*llo";
 		if (hi.substring(2,3).equals("*"))
 		  {
 			return true;
 		  }
 		return false;
     }

     public static String postiveReview(String fileName)
    	 {
    		  String text= textToString(fileName);
    		  String fakeReview= "";
    		  fakeReview=text;
    		  boolean startOfAdjective=false;
    		  int startOfAdjectiveInt=0;
    		  for (int i=0; i<text.length();i++)
    		  {
    			  if (text.substring(i,i+1).equals("*"))
    			  {
    				  startOfAdjective=true;
    				  startOfAdjectiveInt=i;
    			  }
    			  else if (startOfAdjective)
    			  {
    				     if(i==text.length()-1)
    						{
    				    	 fakeReview=fakeReview.substring(0,startOfAdjectiveInt)+randomPositiveAdj()+" "+fakeReview.substring(i);
    						   startOfAdjective=false;
    						}

    				  if (Character.isAlphabetic(i)==false)
    					{
    					   fakeReview=fakeReview.substring(0,startOfAdjectiveInt)+randomPositiveAdj()+" "+fakeReview.substring(i);
    					   startOfAdjective=false;
    					}
    			  }
    			
    		  }
    		  return fakeReview;
    	    }
    	   
     
     public static String negativeReview(String fileName)
     {
		  String text= textToString(fileName);
		  String fakeReview= "";
		  fakeReview=text;
		  boolean startOfAdjective=false;
		  int startOfAdjectiveInt=0;
		  for (int i=0; i<text.length();i++)
		  {
			  if (text.substring(i,i+1).equals("*"))
			  {
				  startOfAdjective=true;
				  startOfAdjectiveInt=i;
			  }
			  else if (startOfAdjective)
			  {
				     if(i==text.length()-1)
						{
				    	 fakeReview=fakeReview.substring(0,startOfAdjectiveInt)+randomNegativeAdj()+" "+fakeReview.substring(i);
						   startOfAdjective=false;
						}

				  if (!Character.isAlphabetic(i))
					{
					   fakeReview=fakeReview.substring(0,startOfAdjectiveInt)+randomNegativeAdj()+" "+fakeReview.substring(i);
					   startOfAdjective=false;
					}
			  }
			 
		  }
		  return fakeReview;
	    }
     
     
   }
