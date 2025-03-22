EW 2Y70YVV1
public class AP2
{

public static String changeKey(String letter, String key)
{
	int n=key.indexOf(letter);
	if(n==-1)
	{
		return letter;
	}
	else if (n=key.length()-1)
	{
		return key.substring(0,n);
	}
	else
	{
		return key.substring(0,n)+key.substring(n+1);
	}
}
}

I would include a new int variable called numberOfChangeKey and would
add 1 to it each time the change Key method was run through. 
Or I would create a method increaseChangeKey that would be called when
you run through changeKey that would implement the numberOfChange
variable.