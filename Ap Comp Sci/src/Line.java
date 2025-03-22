
public class Line {
    //instance fields
	private double slope;
	private double yIntercept;
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	private boolean undefinedSlope=false;
	
	//Constructor: 3 values get a line x,y and slope 
	public Line (double xValue, double yValue, double m)
	{
		x1=xValue;
		y1=yValue;
		slope=m;
		yIntercept=y1-slope*x1;
	}
	
	//Constructor: 4 values get a 2 points x1, y1, x2, and y2
	public Line (double xValue1, double yValue1,double xValue2, double yValue2)
	{
		x1=xValue1;
		y1=yValue1;
		x2=xValue2;
		y2=yValue2;
		
		//Just in case a the slope is undefined 
		if (x2-x1==0)
		 {
			undefinedSlope=true; 
		 }
		else
		{
		slope=(y2-y1)/(x2-x1);
		}
		yIntercept=y1-slope*x1;
	}
	
	//Constructor: 2 values get a slope and y intercepts
	public Line ( double mSlope, double b)
	{
		slope=mSlope;
		yIntercept=b;
	}
	
	//Constructor: 1 values get a x value for an undefined slope;
	public Line (double x)
	{
		x1=x;
		undefinedSlope=true; 
		
	}
	
	//Pre: See if lines intersect by using there slope
	//Post: If line has same slope then they don't intersect but if they are the same line they do intersect at every point
   public boolean intersects (Line other)
   {
	   if (undefinedSlope==true)
	   {
		   if (other.isUndefinedSlope())
		  {
		    if(x1==other.getX1())
		    {
			    return true;
		    }

			   return false;

		  }
		  
			   return true;
	   }
		
	   else if(other.isUndefinedSlope()==true)
	   {
		   return true;
	   }
	   
	   else if(slope==other.getSlope())
	   {
		   if (yIntercept==other.getyIntercept())
		   {
			 return true;  
		   }
		   return false;
	   }
		 return true; 
		  
   }
   
   //Pre: Checks to see if two lines are parallel
   //Post: Uses line instance field of slope to compare the lines
   public boolean isParallel(Line other)
   {
	   if (undefinedSlope==true)
	   {
		   if (other.isUndefinedSlope())
		  {
			   return true;

		  }
		  
			   return false;
	   }
		
	   else if(other.isUndefinedSlope()==true)
	   {
		   return false;
	   }
	   
	   else if(slope==other.getSlope())
	   {
		   return true;
	   }
		 return false; 
   }
   
    //Pre: Checks to see if two lines are parallel
   //Post: Uses line instance field of slope to compare the lines
   public boolean equals(Line other)
   {
	   if (undefinedSlope==true)
	   {
		   if (other.isUndefinedSlope())
		  {
		    if(x1==other.getX1())
		    {
			    return true;
		    }

			   return false;

		  }
		  
			   return false;
	   }
		
	   else if(other.isUndefinedSlope()==true)
	   {
		   return false;
	   }
	   
	   else if(slope==other.getSlope())
	   {
		   if (yIntercept==other.getyIntercept())
		   {
			 return true;  
		   }
		   return false;
	   }
		 return false; 
		  
   }

   //getters and setters
public double getSlope() {
	return slope;
}

public void setSlope(double slope) {
	this.slope = slope;
}

public double getyIntercept() {
	return yIntercept;
}

public void setyIntercept(double yIntercept) {
	this.yIntercept = yIntercept;
}

public double getX1() {
	return x1;
}

public void setX1(double x1) {
	this.x1 = x1;
}

public double getX2() {
	return x2;
}

public void setX2(double x2) {
	this.x2 = x2;
}

public double getY1() {
	return y1;
}

public void setY1(double y1) {
	this.y1 = y1;
}

public double getY2() {
	return y2;
}

public void setY2(double y2) {
	this.y2 = y2;
}

public boolean isUndefinedSlope() {
	return undefinedSlope;
}

public void setUndefinedSlope(boolean undefinedSlope) {
	this.undefinedSlope = undefinedSlope;
}

}
