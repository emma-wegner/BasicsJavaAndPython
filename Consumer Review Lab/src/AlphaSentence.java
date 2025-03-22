import java.lang.reflect.Array;

public class AlphaSentence
{
   //private instance fields
   private String word1;
   private String word2;
   private String word3;
   
   //default constructor
   public AlphaSentence()
   {
      word1 = "";
      word2 = "";
      word3 = "";
   }
   
   //constructor #2: gets three inputted words
   public AlphaSentence(String w1, String w2, String w3)
   {
      word1=w1;
      word2=w2;
      word3=w3;
   }
   
   //precondition: has three parameters that are three different words
   //postcondition: returns them in alphabetical order
   public String alphaWords(String w1, String w2, String w3)
   {
      boolean decision = false;
      do 
      {
        decision = false;
        
        //uses String method .equals()
        if(w2.equals(w1) && w3.equals(w2) && w2.equals(w3))
        {
           return "All words are same";
        }
        
        //uses String method compareTo()
        if (w2.compareTo(w1) < 0) 
        {
           //control variable that saves value of w2
           String temp = w2;
           w2 = w1;
           w1 = temp;
           decision = true;
        }
        
        if (w3.compareTo(w2) < 0) 
        {
           //control variable that saves value of w3
           String temp = w3;
           w3 = w2;
           w2 = temp;
           decision = true;
        }
        
        if (w3.compareTo(w1) < 0) 
        {
           //control variable that saves value of w1
           String temp = w3;
           w3 = w1;
           w1 = temp;
           decision = true;
        }   
      } while (decision);
      
      //if two words equal each other then just return one variable
      if(w2.equals(w1))
         return "Word 1 & 2: " + w1 + "\nWord 3: " + w3;
      
      else if(w2.equals(w3))
         return "Word 1: " + w1 + "Word 2 & 3: " + w2;

      else if(w3.equals(w1))
         return "Word 1 & 3: " + w3 + "Word 2" + w2;
 
      //if not then return all different words
      else
         return "Word 1: " + w1 + "\nWord 2: " + w2 + "\nWord 3: " + w3;
   }
   
   public String sameLetter(String w1, String w2, String w3)
   {
      int count1 = 0 ;
      int count2 = 0;
      int count3 = 0;
      String word = "";

      for (int i=0; i<w1.length(); i++) 
      {
         for (int j=i+1; j < w1.length(); j++) 
         {
              if(w1.charAt(i)==w1.charAt(j))
              {
                  count1++;
                  word=w1.charAt(i)+"";
                  w1=w1.replaceAll(word,"");
              }
          } 
      }
      
      for(int k=0; k<w2.length(); k++)
      {
         for(int l=k+1; l<w2.length(); l++)
         {
            if(w2.charAt(k)==w2.charAt(l))
            {
               count2++;
               word=w2.charAt(k)+"";
               w2=w2.replaceAll(word,"");
            }   
         }
      }
      
      for(int m=0; m<w3.length(); m++)
      {
         for(int n=m+1; n<w3.length(); n++)
         {
            if(w3.charAt(m)==w3.charAt(n))
            {
               count3++;
               word=w3.charAt(m)+"";
               w3=w3.replaceAll(word,"");

            }
            
         }
            
      }  
      return "Word 1: " + count1 + "\nWord 2: " + count2 + "\nWord 3: " + count3;
   }

   //getter method for word1
   public String getWord1()
   {
      return word1;
   }

   //setter method for word1
   public void setWord1(String word1)
   {
      this.word1 = word1;
   }

   //getter method for word2
   public String getWord2()
   {
      return word2;
   }

   //setter method for word2
   public void setWord2(String word2)
   {
      this.word2 = word2;
   }

   //getter method for word3
   public String getWord3()
   {
      return word3;
   }

   //setter method for word3
   public void setWord3(String word3)
   {
      this.word3 = word3;
   }
   
}