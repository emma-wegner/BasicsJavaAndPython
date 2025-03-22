import java.util.Scanner;

public class LoopPractice {
    //Your method should take an integer that represents the number of terms
	//to be used in the summation for the calculation of piπ

//Example:  piApprox(100) \longrightarrow⟶ 3.1315925...       
//needs to be close to many decimal places, but might            
//piApprox(100000) \longrightarrow⟶ 3.1415858... 
//not be exact due to round-off errors. 
	public double piApprox(int n)
	{
		int count=0;
		double pi=4.0;
		boolean postive=false;
		for (int j=3; count<=n;j=j+2)
		{
             if(!postive)
			{
				pi=pi-(1/n)*4;
				postive=true;
			}
			else
			{
				pi=pi+(1/n)*4;
				postive=false;
			}
		}
		return pi;
	}
	
	}
	
