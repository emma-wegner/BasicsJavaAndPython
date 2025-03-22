import java.util.Random;

import javax.swing.ImageIcon;

public class Player {
	 private int computerAmountTaken;
	 private int move;
	 private int personsAmountTaken;
	 Pile pile=new Pile();
   
	//default constructor
	 public Player()
	 {
		 personsAmountTaken=0;
	 }
	 
	 //constructor #2: gets three inputed words
	 public Player( int p)
	 {
		 personsAmountTaken=p;
	 }
	 
	 //Pre: Method that makes random move for computer between 1-n/2
	 //Post: Method return computer Amount Taken and changes marble amount
	 public int dumbComputerMove()
	 {
		if (pile.getMarbleAmount()==2)
		{
			pile.setMarbleAmount(pile.getMarbleAmount()-computerAmountTaken);
			return 1;
		}
		else if(pile.getMarbleAmount()==1)
		{
			pile.setMarbleAmount(pile.getMarbleAmount()-computerAmountTaken);
			return 1;
		}
		else
		{
		 int n=pile.getMarbleAmount()/2;
		 Random shuffle=new Random();
		 computerAmountTaken=shuffle.nextInt(n)+1;
		 pile.setMarbleAmount(pile.getMarbleAmount()-computerAmountTaken);
		 return computerAmountTaken;
		}
	 }
	 
	//Pre: Method that makes a smart move for computer between 1-n/2 that can be 2 to a power
	//Post: Method return computer Amount Taken and changes marble amount
	 public int SmartComputerMove()
	 {
		move=pile.getMarbleAmount()+1;
		if (pile.getMarbleAmount()==2)
		{
			pile.setMarbleAmount(pile.getMarbleAmount()-1);
			 return 1;
		}
		else if (isAPowerOfTwo())
		 {
			 dumbComputerMove();
		 }
		 else 
		 {
			 int n=pile.getMarbleAmount();
			 for (int i=n; i>1;i--)
			 {
				move=i+1; 
				if (isAPowerOfTwo())
				{
					computerAmountTaken=pile.getMarbleAmount()-i;
					pile.setMarbleAmount(pile.getMarbleAmount()-computerAmountTaken);
					 return computerAmountTaken;
				}
			 }
		 
		 }
		return 0;
	   }
	 
	//Pre: Method boolean that makes sure  move is a good move being a power of 2
		 //Post: Can be useed to determine if a computer or person move is good
	 public boolean isAPowerOfTwo()
	 {
		 if(move<=0) 
		        return false;
		 
		    while(move>2){
		        int t = move>>1;
		        int c = t<<1;
		 
		        if(move-c != 0)
		            return false;
		 
		        move = move>>1;
		    }
		 
		    return true;
	 }
	 
	 //Pre: checks to see if person move is legal
	 //Post:uses earlier method to compare if the amount is between 1-n/2
	 public boolean isLegalMove()
	 {
		 if (getPersonsAmountTaken()<=pile.getMarbleAmount()/2&&getPersonsAmountTaken()>0)
		 {
			 return true;
		 }
		 return false;
	 }
	 
	 //setters and getters
	 public void setMarbleAmountAfterPerson()
	 {
		 pile.setMarbleAmount(pile.getMarbleAmount()-personsAmountTaken);
	 }

	public int getComputerAmountTaken() {
		return computerAmountTaken;
	}

	public void setComputerAmountTaken(int computerAmountTaken) {
		this.computerAmountTaken = computerAmountTaken;
	}

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	public int getPersonsAmountTaken() {
		return personsAmountTaken;
	}

	public void setPersonsAmountTaken(int personsAmountTaken) {
		this.personsAmountTaken = personsAmountTaken;
	}

	public Pile getPile() {
		return pile;
	}

	public void setPile(Pile pile) {
		this.pile = pile;
	}

	 
}
