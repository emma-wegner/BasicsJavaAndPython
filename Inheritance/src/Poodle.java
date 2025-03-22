/** Program to demonstrate simple inheritance
*
*@author Fran Trees  July, 2002
*
*/
public class Poodle extends Dog {
	
	public Poodle(){
		super("Foo Foo","caviar");
	}
	
 
	public Poodle(String name,String food){
		super(name,food);
	}

	/**
	*demonstrates sound made by Dog
	*
	*/	

	public void makeNoise(){
		System.out.println("yap yap yap");
		super.makeNoise();
	}

	/**
	*uses call to super to print stuff about a Dog
	*
	*/		
	public void print(){
		 //super.print();
		//System.out.println("I really am a Sophisticated Dog!");
		makeNoise();
	//	super.makeNoise();
	}
		
	
	
	 

}
	

