import java.util.Scanner;

public class CandyBarTester
{

   public static void main(String[] args)
   {
      String[] brands = new String[3];
      
      Scanner in = new Scanner(System.in);
      int count=0;
      while(count<3)
      {
         System.out.println("Enter in a name: ");
         String name = in.nextLine();
         
         if(CandyBar.nameEqual(name))
         {
            brands[count] = name;
            count++;
         }
         
         else
            System.out.println("Try again.");
      }
      
      System.out.println();
      
      for(int i=0; i<brands.length; i++)
      {
         System.out.println("Here is the Sugar Percent for " + brands[i] + ": " + CandyBar.getSugarPercent(brands[i])*100 + "%");
      }
      
      double highestSugarPercent=CandyBar.getSugarPercent(brands[0]);
      int brand = 0;
      
      for(int i=0; i<brands.length; i++)
      {
         if(CandyBar.getSugarPercent(brands[i])>highestSugarPercent)
         {
            highestSugarPercent = CandyBar.getSugarPercent(brands[i]);
            brand = i;
         }
      }
      
      System.out.println();
      System.out.println(brands[brand] + " has the Highest sugar Percent: " + highestSugarPercent*100 + "%");
      
   }
}