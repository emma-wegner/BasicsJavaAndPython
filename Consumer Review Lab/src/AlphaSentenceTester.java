
import java.util.Scanner;



/* Name: Kareena Shah

   Date: Oct 8, 2019

   FileName: AlphaSentenceTester.java

   Description: 

*/



public class AlphaSentenceTester

{



   public static void main(String[] args)

   {
      Scanner in = new Scanner (System.in);

      System.out.println("This program puts 3 words in alphabetical order ");

      System.out.println("Enter in a word: ");

      String one = in.nextLine();
      
      System.out.println("Enter in a word: ");

      String two = in.nextLine();
      
      System.out.println("Enter in a word: ");

      String three = in.nextLine();
      

      AlphaSentence newSentence = new AlphaSentence(one, two, three);

      System.out.println(newSentence.alphaWords(one, two, three));
   

   }



}