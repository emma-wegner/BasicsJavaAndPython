/** Program to demonstrate simple inheritance
*
*@author Fran Trees  July, 2002
*
*/
public class Animal{
	private String myName;
	private String myFood;
	
	
	public Animal(){
		myName = "noName";
		myFood = "grass";
	}
	
	
	public Animal(String name, String food){
		myName = name;
		myFood = food;
	}
	/**
	*demonstrates sound made by creature
	*
	*/
	
	public void print(){
		System.out.println("My name is " + myName + ". I eat " + myFood);
	}
		
	
	public void makeNoise(){
		System.out.println("I make noises");
	}
	/**
	*@return name
	*
	*/
	public String getName(){
		return myName;
	}
	/**
	*@return favorite food
	*
	*/
	public String getFood(){
		return myFood;
	}
	/**
	*normal behavior is exhibited
	*
	*/
	
	public void behave(){
		System.out.println("I behave poorly all of the time!");
	}
	
	/**
	* begging behavior
	*
	*/
	public void beg(){
		System.out.println("I want food NOW!");
	}
	
	/**
	*@param x is offset of x coordinate requested
	*@param y is offset of y coordinate requested
	* 
	*creature is moved
	*
	*/
	
	public void move (int x, int y){
		//code here would change x coordinate by x and y coordinate by y
	}
	
	public String toString()
	{
		return "My name is " + getName() + " and I eat " + getFood();
	}
	
}
		
	
