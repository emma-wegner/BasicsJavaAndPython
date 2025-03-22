import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CandyBar
{
   private static HashMap<String, Double> candyBar = new HashMap<String, Double>();
   private static ArrayList<String> names = new ArrayList<String>();
   
   static
   {
      try 
      {
        Scanner input = new Scanner(new File("candy-data.csv"));
        while(input.hasNextLine())
        {
           String[] temp = input.nextLine().split(",");
           candyBar.put(temp[0],(Double.parseDouble(temp[1])));
           names.add(temp[0]);
        }
        input.close();
      }
      
      catch(Exception e)
      {
        System.out.println("Error reading or parsing candy-data.csv");
      }  
    }
   
   public static Double getSugarPercent(String name)
   {
      return candyBar.get(name);
   } 
   
   public static boolean nameEqual(String name)
   {
      for(int i=0; i<candyBar.size(); i++)
      {
         if(names.get(i).equals(name))
            return true;
      }
      
      return false;
   }
}