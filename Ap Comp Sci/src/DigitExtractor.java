public class DigitExtractor
{
   /**
      Constructs a digit extractor that gets the digits
      of an integer in reverse order.
      @param anInteger the integer to break up into digits
   */
	int num;

   public DigitExtractor(int anInteger)
   {
      num=anInteger;
   }

   /**
      Returns the next digit to be extracted.
      @return the next digit
   */
   public int nextDigit()
   {
      int y=num%10;
      num=num/10;
	   return y;
      
   }

}