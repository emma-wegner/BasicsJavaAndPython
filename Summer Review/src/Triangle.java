import java.util.Random;

public class Triangle {
	//variables
	private int one;
	private int two;
	private int three;
	int triangle2One;
	int triangle2Two;
	double triangle2Three;
	
	//constructor
	public Triangle(int side1, int side2, int side3, int two1, int two2, int two3)
	{
		one=side1;
		two=side2;
		three=side3;
		triangle2One= two1;
		triangle2Two=two2;
		triangle2Three=two3;
	}
	
	//Pre: boolean class that uses the side objects 
	//Post: This determine if the triangle is a true triangle
	public boolean noTriangle()
	{
		if (one>=two+three)
		{
			return false;
		}
		else if (two>=one+three)
		{
			return false;
		}
		else if (three>=one+two)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	//Pre boolean class that uses the side objects 
	//Post:this determine if the triangle is an isosceles triangle
	public boolean isosceles()
	{
		if (one==two)
		{
			return true;
		}
		else if (one==three)
		{
			return true;
		}
		else if (two==three)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Pre: boolean class that uses the side objects 
	//Post: this determine if the triangle is an equilateral triangle
	public boolean equilateral()
	{
		if (one==two&&two==three)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Pre: changes the value of triangle 2 sides 
	//Post: this make the sides of the triangle equal to one random number
		public void makeEquilateral()
		{
			triangle2One=shuffle();
			triangle2Two=triangle2One;
			triangle2Three=triangle2One;
		}
		
		//Pre: changes the value of triangle 2 sides 
		//Post: this method make two sides of the triangle equal to one random number
		//and another side to another
		public void makeIscosceles()
		{
		  triangle2One=shuffle();
			triangle2Two=triangle2One;
		  Random ran= new Random();
		  triangle2Three=ran.nextInt(triangle2One+triangle2Two-1)+1;
		}
		//Pre: changes the value of triangle 2 sides 
		//Post:this method make each side of the class equal to a random number
		public void makeScalene()
		{
			triangle2One=shuffle();
			
			do
			{
			triangle2Two=shuffle();
			} while(triangle2One==triangle2Two);
			
		  	do
		  	{
				triangle2Three=shuffle();
				} while(triangle2Three==triangle2Two&&
						triangle2Three==triangle2One&&
						noTriangle()==true);	
		  
	    }
		
		//Pre: this method uses the random class
		//Post: this make return a random number that can be used to construct 
		//the triangle in different methods
		public int shuffle()
		{
			Random shuffle= new Random();
			return shuffle.nextInt(30)+1;
		}
		
		//Pre: changes the value of triangle 2 sides 
		////Post: this method make two sides of the class equal to one random number and another equal
		//to the other sides number times the square root of 2
		public void makeRightIsosceles()
		{
			triangle2One=shuffle();
			triangle2Two=triangle2One;
			triangle2Three=triangle2One*Math.sqrt(2);
		}
	
		//Pre: changes the value of triangle 2 sides 
		////POST: this method make two sides of the class equal to two random number and makes the third
		//equal the square root of side1 squared plus side2 squared
		public void makeRightScalene()
		{
			triangle2One=shuffle();
			do
			{
				triangle2Two=shuffle();
			} while(triangle2Two==triangle2One);
			//work on this
			triangle2Three=Math.sqrt(triangle2One*triangle2One+triangle2Two*triangle2Two);
			
		}
	

}
