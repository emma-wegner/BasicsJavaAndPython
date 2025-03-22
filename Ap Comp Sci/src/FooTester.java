import java.util.Scanner;

public class FooTester {
	public static void main(String[] args) {
		//first you need fill board with foo list depending on size and size of the board
		int boardSize=0;
		int fooLength=0;
		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to FooList!");
		System.out.println("Pick your Board Size");
		//Probably only even
		boardSize=in.nextInt();
		System.out.println("Pick your Foo Length");
		fooLength=in.nextInt();
		FooList fooList=new FooList(); 
	    fooList.setFooLength(fooLength);
	    Board game= new Board(boardSize, fooList);
	    Scanner scan=new Scanner(System.in);
	    
	    //needs to fix
	    for(int i=0; i<boardSize*boardSize/2;i++)
	    {
	    	boolean end=false;
	     while(!end)
	     {
	    	System.out.println("Enter a Foo");
	    	String a=scan.nextLine();
	    	fooList.addFoo(a);
	    	if(fooList.getpossibleFoosSize()==i+1)
	    	{
	    		end=true;
	    	}

	     }
	    }
	  game.fillBoard();
	   
       //Prints Board and ask for information
    	//Uses information to fill board
    	//Stops when board is eventually filled
     while(!game.allTilesUp())
     {
    	 game.printBoard();
    	 int guessA=0;
    	 int guessB=0;
    	 int guess2A=0;
    	 int guess2B=0;
    	 System.out.println("Please guess a location");
    	 guessA=in.nextInt();
    	 guessB=in.nextInt();
    	 game.lookAtTile(guessA, guessB);
    	 System.out.println("Please guess another location");
    	 guess2A=in.nextInt();
    	 guess2B=in.nextInt();
    	 game.lookAtTile(guess2A, guess2B);
    	 game.printBoard();
    	 game.checkMatch(guessA, guessB, guess2A, guess2B);
    	 System.out.println();
    	 
     }
     System.out.println("You Win");

 }
}
