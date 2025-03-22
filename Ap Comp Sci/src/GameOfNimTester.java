import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class GameOfNimTester {
	public static void main(String[] args) {
		
		boolean end=false;
		boolean computerLose=false;
		Scanner in = new Scanner (System.in);
		  
		  System.out.println("Welcome to the game of nim");
          System.out.println("Do you want to play smart mode? type 0-yes or 1-no");
          int hardMode=in.nextInt();
          
          int personAmount = 0;
  		  ImageIcon image=null;
          Random shuffle=new Random();
     	 int turn=shuffle.nextInt(1);
     	 
		Player game=new Player(personAmount);
		System.out.println("The marble amount is "+game.pile.getMarbleAmount());
		
     	if(turn==0)
     	{
     		System.out.println("Enter a move (make sure it between one and half the amount of marbles)");
     		personAmount=in.nextInt();
     		game.setPersonsAmountTaken(personAmount);
     		while (!game.isLegalMove())
     		{
     			System.out.println("Enter a move (make sure it between one and half the amount of marbles)");
         		personAmount=in.nextInt();
         		game.setPersonsAmountTaken(personAmount);
     		}
     		game.setMarbleAmountAfterPerson();
     		System.out.println("The marble amount is "+game.pile.getMarbleAmount());
     	}
     	while (game.pile.getMarbleAmount()>0)
     	{
     		if(hardMode==0)
     		{
     			System.out.println("Computer took "+ game.SmartComputerMove());
     		}
     		else
     		{
     			System.out.println("Computer took "+ game.dumbComputerMove());	
     		}
     			System.out.println("The marble amount is "+game.pile.getMarbleAmount());
     			if (game.pile.getMarbleAmount()==0)
     			{
     				computerLose=true;
     				break;
     			}
     			else if(game.pile.getMarbleAmount()==1)
     			{
     				break;
     			}
     			System.out.println("Enter a move (make sure it between one and half the amount of marbles)");
         		personAmount=in.nextInt();
         		game.setPersonsAmountTaken(personAmount);
         		while (!game.isLegalMove())
         		{
         			System.out.println("Enter a move (make sure it between one and half the amount of marbles)");
             		personAmount=in.nextInt();
             		game.setPersonsAmountTaken(personAmount);
         		}
         		game.setMarbleAmountAfterPerson();
         		System.out.println("The marble amount is "+game.pile.getMarbleAmount());
         		game.pile.getMarbleAmount();
     	}
     		
     	
     	 if (computerLose)
			{
     		 System.out.println("You won!!");
			}
     	 else
     	 {
     		 System.out.println("Sorry you lost");
     	 }
     	
     	}
     	 
	      
	}

