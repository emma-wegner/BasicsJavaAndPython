import java.util.Random;

/* 
Description:
Constructs n by n concentration board of Tiles whose image values are chosen from the already 
filled fooList list. 
 */

public class Board
{
	
	private Tile[][] gameBoard;
	   private int size;
	   private int rowLength;
	   private int numberOfTilesFaceUp;
	   private FooList possibleTileValues;
	   private  int [] ray=new int[2];
   //precondition: n is the length of a side of the board, n is an even positive integer.
   //                      FooList contains at least n*n/2 strings
   //@param n is the length of the side of the concentration board(an even number)
   //@param list the FooList from which the values for the tiles are chosen.
   public Board(int n, FooList list)
   {
      gameBoard = new Tile[n][n]; //Concentration board
      
      size=n*n;  //Number of tiles on board
      numberOfTilesFaceUp=0; //Number of Tiles face up
      rowLength=n;                   //Number of Tiles in a row
      
      possibleTileValues=list;   //Possible Tile images
      fillBoard();                     //Calls method to fill board with Tiles 
   }

/**
    * Randomly fills this concentration board with tiles. The number of distinct tiles used
    * on the board is size/2. Any one tile image appears exactly twice.
    * Precondition: number of positions on board is even, possibleTileValues contains
    * at least size/2 elements.
    */
   public void fillBoard()
   {
	   Tile t;
	   Tile m;
	   for(int i=0; i<possibleTileValues.getpossibleFoosSize();i++)
	   {
		   
		   t=new Tile(possibleTileValues.getFoo(i));
		   shuffle();

		  gameBoard[ray[0]][ray[1]]=t;
		  m=new Tile(possibleTileValues.getFoo(i));
		  shuffle();

		  gameBoard[ray[0]][ray[1]]=m;
		  
		
	   }
	   
   }
   private void shuffle()
   {
	   
	
	   int row=0;
	   int column=0;
	   boolean end=false;
			   while(!end)
			   {
	              Random shuffle= new Random();
	              row=shuffle.nextInt(gameBoard.length);//-1
	              column=shuffle.nextInt(gameBoard.length);//-1
	           if(gameBoard[row][column]==null)
	            {
		          ray[0]=row;
		          ray[1]=column;
		          end=true;
		   
	             }
			   }

   }
   

   /**
    * PreCondition: 0 <= r <rowLength and 0 <= c <= rowLength 
    *                       tile in position [r][c] is face-down.
    * PostCondition: After execution [r][c] is face-up.
    */
   public void lookAtTile(int r, int c)
   {
      if (r>=0&&r<rowLength)
      {
    	  if (c>=0 &&r<rowLength)
    	  {
    		 gameBoard[r][c].turnFaceUp(); 
    	  }
      }
   }
   /**
    * Checks whether the Tiles in r1,c1 and r2,c2 have the same image. If they do , the Tiles 
    * are turned face-up. If not, the Tiles are turned face-down.
    * preCondition: gameBoard[r1][c1] is face-up, gameBoard[r2][c2] is face-up.
    * @param r1 index in gameBoard, 0<=r1< rowLength
    * @param c1 index in gameBoard, 0<=r1< rowLength
    * @param r2 index in gameBoard, 0<=r1< rowLength
    * @param c2 index in gameBoard, 0<=r1< rowLength
    */
   //might need to do more
   public void checkMatch(int r1, int c1, int r2, int c2)
   {
      if(!(gameBoard[r1][c1].showFace().equals(gameBoard[r2][c2].showFace())))
      {
    	  gameBoard[r1][c1].turnFaceDown();  
    	  gameBoard[r2][c2].turnFaceDown(); 
      }
   }
   /**
    * Board is printed for the player. If the Tile is turned face-up, the image is printed. 
    * If the Tile is turned face-down, the Tile position is printed. 
    */

   public void printBoard()
   {
      for (int r=0; r<rowLength;r++)
      {
    	  for (int c=0; c<gameBoard.length;c++)
          {  
            	System.out.print(gameBoard[r][c].showFace()+" ");
          }
    	  System.out.println();
      }
   }
   

   public Tile pickTile(int r, int c)
   {
      return gameBoard[r][c];
   }
   
   /**
    * Checks whether all tiles are face-up.
    * @return true if all tiles are face-up, false otherwise
    */
   public boolean allTilesUp()
   {
	   for (int r=0; r<gameBoard.length;r++)
	      {
	    	  for (int c=0; c<gameBoard.length;c++)
	          { 
	    		if(!(gameBoard[r][c].isFaceUp()))
	    		{
	    			return false;
	    		}
	          }
	      }
	   return true;
	   
   }
public FooList getPossibleTileValues() {
	return possibleTileValues;
}
public void setPossibleTileValues(FooList possibleTileValues) {
	this.possibleTileValues = possibleTileValues;
}
public String getGameBoardPos(int a, int b) {
	return gameBoard[a][b].showFace();
}
public void setGameBoard(Tile[][] gameBoard) {
	this.gameBoard = gameBoard;
}
   
   
}
