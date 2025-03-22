

public class Dog extends Animal implements IntelligentBeing{
	
private int age;
	
	public Dog(){
		super("Fido","rabbit");
		age = 0;
	}
	

	public Dog(String name,String food){
		super(name,food);
	   age = 0;
	}

	/**
	*demonstrates sound made by Dog
	*
	*/	

	public void makeNoise()
	{
		System.out.println("BOW-WOW");
	//	super.makeNoise();
	}
	/**
	*uses call to super to print stuff about a Dog
	*
	*/		
	public void print(){
	   //super.print();
		makeNoise();
	}
		
	
	/**
	*normal behavior is exhibited
	*
	*/
	public void behave(){
		System.out.println("I am sitting-up and being cute.");
	}
	
	/**
	*demonstrates begging behavior of Dog
	*
	*/
	public void beg(){
		System.out.println("Wolf...Wolf...Wolf...Wolf....Wolf");
	}
		

	public void completelyFoolEveryone(){
		System.out.println("I can fool all of the people all of the time");
	}	
	
	public void doTrick(){
		System.out.println("I can shake hands");
	}
 

}
	


