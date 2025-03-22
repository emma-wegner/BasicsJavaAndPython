import java.util.Scanner;

import javax.swing.ImageIcon;

import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class TriviaProgram {
  
	 private static ArrayList<String> Questions = new ArrayList<String>();
	 private static ArrayList<String> Answers = new ArrayList<String>();
     private static final String SPACE = " ";
     private static ImageIcon image;
     
	static{
  try {
      Scanner input = new Scanner(new File("Questions.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        //System.out.println(temp);
        Questions.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
     
     
     try {
         Scanner input = new Scanner(new File("Answers.txt"));
         while(input.hasNextLine()){
           String temp = input.nextLine().trim();
           //System.out.println(temp);
           Answers.add(temp);
         }
         input.close();
       }
       catch(Exception e){
         System.out.println("Error reading or parsing Answers.txt\n" + e);
       }   
        }
  
/** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public String textToString( String filename)
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(filename));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext())
      {
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e)
    {
      System.out.println("Unable to locate " + filename);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim(); 
  }
public static ArrayList<String> getQuestions() {
	return Questions;
}
public static void setQuestions(ArrayList<String> questions) {
	Questions = questions;
}
public static ArrayList<String> getAnswers() {
	return Answers;
}
public static void setAnswers(ArrayList<String> answers) {
	Answers = answers;
}
public static ImageIcon getMyIcon() {
	return image;
}
public static void setMyIcon(ImageIcon image) {
	TriviaProgram.image = image;
}    
   }
