
public class NumberFacts {
	
	//Remember Zero and 1
	private int number;
	
	//default constructor
	   public NumberFacts()
	   {
	     number=0;
	   }
	   
	   //constructor #2: gets three inputted words
	   public NumberFacts(int num)
	   {
	      number=num;
	   }
	
	//getValue: returns original value
	public int getValue()
	{
		return number;
	}
	//sumInts: returns the sum of the positive integers less than or
	//equal to the NumberFacts 
	public int sumInts()
	{
		int sum=0;
		if (number>0)
		{
		for (int i=1;i<=number;i++)
		{
			sum+=i;
		}
		return sum;
		}
		else
		{
			return 0;
		}
	}
	//findFactorial: returns n!
	public String findFactorial()
	{
	  long factorial=1;
	  if (number==0)
	  {
		  return factorial+"";
	  }
	  else if(number>20)
		{
		return "Can't be computed";
		}
	  else if(number>0)
		{
		for (int i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
		return factorial+"";
		}
	  else
	  {
		  return "none";
	  }
	  
	}
	//getFactors: gets all factors of the NumberFacts’ value
	public String getFactors()
	{
		String factors=" ";
		if(number==0)
		{
			return "none";
		}
		for (int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				factors+=i+" ";
			}
		}
         return factors;
	}
	//isPrime: returns true if the value is prime, false otherwise
	public boolean isPrime()
	{
		for (int i=2;i<=number;i++)
		{
			if (number%i==0)
			{
				return true;
			}
		}
		return false;
	}
	//findNumberOfDigits: returns the number of digits in the NumberFact value
	public int findNumberOfDigits()
	{
		
		int numberOfDigits=1;
		for (int m=number; m>9;m=m/10)
		{
			numberOfDigits++;
		}
		return numberOfDigits;
	}
	//findSumOfDigits: returns the sum of the digits in the value. 
	public int findSumOfDigits()
	{
		int k=number;
		int sum = 0;
		for (k=number; k>0;k=k/10)
		{
			
			sum+=k%10;
		}
		return sum;
	}
	//For example if value = 123, this method should return 1+2+3=6
	//isPerfect: returns true if the value is a “perfect” number, 
	//false otherwise. A perfect number P is equal to the sum of its divisors
	//(where the divisors include 1, but not P itself). 
	//Examples: 6 = 1 + 2 + 3 = 6 and      28 = 1 + 2 + 4 + 7 + 14 = 28 
	//are perfect numbers.
	public boolean isPerfect()
	{
		int sum=0;
		if (number==1)
		{
			return false;
		}
		else if (number>0)
		{
		for (int i=1;i<=number;i++)
		{
			sum+=i;
			if (sum==number)
			{
				return true;
			}
		}
		return false;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isPerfectSquare(int num)
	{

		for (int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				if(num/i==i)
				{
					return true;
				}
			}
		}
		return false;
	}
}
