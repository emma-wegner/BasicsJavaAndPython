import java.util.Random;

public class Rational {
	private int numerator;
	private int denominator;
	private int n;
	private int d;
	
	//constructor
	public Rational(int num, int den)
	 {
		  numerator=num;
		  denominator=den;
	     reduce();
		  n=numerator;
		  d=denominator;
	 }
	
	public void reduce()
	{
		int m=numerator;
		boolean end=false;
		if (numerator==0)
		{
			denominator=1;
		}
		if(denominator==0)
		{
			denominator=1;
		}
		else if(denominator<0)
		{
			numerator=-1*numerator;
			denominator=-1*denominator;
		}
		if(numerator<0)
		{
			m=numerator*-1;
		}
		for (int i=m;i>1&&!end;i--)
		{
			if(denominator%i==0&&numerator%i==0)
			{
				numerator/=i;
				denominator/=i;
				end=true;
			}
		}

	}
	

	//public method getReciprocal that returns a Rational that is the reciprocal of this Rational.
	public Rational getReciprocal()
	{
		Rational r1=new Rational(denominator,numerator);
		
		return r1;
	}
	//public method add that has one Rational parameter and returns a Rational that is the sum of this Rational 
	//and adds Rational parameter.
	public Rational add(Rational other)
	{
		boolean end=false;
		
		if(denominator==other.getDenominator())
		{
			n=numerator+other.getNumerator();
			d=denominator;
			
		}
		else
		{
			int lessD=denominator;
			int greaterD=other.getDenominator();
			if (other.getDenominator()<denominator)
			{
				lessD=other.getDenominator();
				greaterD=denominator;
			}
			for(int j=lessD;!end;j+=lessD)
			{
				if(j%greaterD==0)
				{
					d=j;
					end=true;
					
				}
			}
			int newNumerator=(d/denominator)*numerator;
			int  newOtherNumerator=(d/other.getDenominator())*other.getNumerator();
			n=newNumerator+newOtherNumerator;
		}
        Rational r1=new Rational(n,d);
		return r1;

	}
	//public method subtract that has one Rational parameter and returns a Rational 
	//that is the difference of this Rational and subtracts Rational parameter.
	public Rational subtract(Rational other)
	{
        boolean end=false;
		
		if(denominator==other.getDenominator())
		{
			n=numerator-other.getNumerator();
			d=denominator;
			
		}
		else
		{
			int lessD=denominator;
			int greaterD=other.getDenominator();
			if (other.getDenominator()<denominator)
			{
				lessD=other.getDenominator();
				greaterD=denominator;
			}
			for(int j=lessD;!end;j+=lessD)
			{
				if(j%greaterD==0)
				{
					d=j;
					end=true;
					
				}
			}
			int newNumerator=(d/denominator)*numerator;
			int  newOtherNumerator=(d/other.getDenominator())*other.getNumerator();
			n=newNumerator-newOtherNumerator;
		}
		Rational r1=new Rational(n,d);
		return r1;
	}
	//public method multiply that has one Rational parameter and returns a Rational that is the product of this Rational
	//and multiply Rational parameter.8.  
	public Rational multiply(Rational other)
	{
		n=numerator*other.getNumerator();
		d=denominator*other.getDenominator();
		Rational r1=new Rational(n,d);
		return r1;
	}
	//public method divide that has one Rational parameter and returns a Rational that is the quotient 
	//of this Rational and divides Rational parameter.
	public Rational divide(Rational other)
	{
	n=numerator*other.getDenominator();
	d=denominator*other.getNumerator();
	Rational r1=new Rational(n,d);
	return r1;
	}
	//public method equals that has one Object parameter. Compare this Rational to the parameter. 
	//The result is true if and only if the two have numerator values that are equal and denominator values that are equal. 
	public boolean equals(Rational other)
	{
		if(numerator==other.getNumerator()&&denominator==other.getDenominator())
		{
			return true;
		}
		return false;
	}
	
	//public method that compares rational to see which is greater
	public Rational CompareTo(Rational other)
	{
      boolean end=false;
     int greaternum;
		
		if(denominator==other.getDenominator())
		{
			n=numerator+other.getNumerator();
			d=denominator;
			
		}
		else
		{
			int lessD=denominator;
			int greaterD=other.getDenominator();
			if (other.getDenominator()<denominator)
			{
				lessD=other.getDenominator();
				greaterD=denominator;
			}
			for(int j=lessD;!end;j+=lessD)
			{
				if(j%greaterD==0)
				{
					d=j;
					end=true;
					
				}
			}
			int newNumerator=(d/denominator)*numerator;
			int  newOtherNumerator=(d/other.getDenominator())*other.getNumerator();
			greaternum=newNumerator;
			if(other.getNumerator()>numerator)
			{
				return other;
			}
		}
        Rational r1=new Rational(numerator,denominator);
		return r1;

	}
  //setters and getters
	public String toString()
	{
		return numerator+"/"+denominator;
		
	}
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
}
