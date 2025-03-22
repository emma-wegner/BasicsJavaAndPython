/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   /**
      Constructs a cash register with no money in it.
   */
	//Instance fields
	public static final double QUARTER_VALUE = 0.25;
	   public static final double DIME_VALUE = 0.1;
	   public static final double NICKEL_VALUE = 0.05;
	   public static final double PENNY_VALUE = 0.01;

	   private double purchase;
	   private double payment;
	   private double change;
	   
	   //constructor
   public CashRegister(double myPurchase, double myPayment, double mychange)
   {
	   purchase=myPurchase;
	   payment=myPayment;
	   change=mychange;
   }

   /**
      Records the purchase of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      purchase= amount;
   }

   /**
      Enters the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
   public void enterPayment(int dollars, int quarters, 
      int dimes, int nickels, int pennies)
   {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
         + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
      
   }
   
   /**
      Computes the number of dollars due to the customer.
      @return the number of dollars in the change due
   */
   public int giveDollars()
   {
	   change=payment-purchase;
	   return (int)(payment-purchase);
      
   }

   /**
      Computes the number of quarters due to the customer.
      @return the number of quarters in the change due
   */
   public int giveQuarters()
   {
     change=change-giveDollars();
     change *=100;
    int quarters=(int)change/25;
    return quarters;
   }

   /**
      Computes the number of dimes due to the customer.
      @return the number of dimes in the change due
   */
   public int giveDimes()
   {
	      
	    change= change%25;
	    int dimes=(int)change/10;
	    return dimes;
   }

   /**
      Computes the number of nickels due to the customer.
      @return the number of nickels in the change due
   */
   public int giveNickels()
   {
	   change=change%10;
	   int nickels=(int)change/5;
	   return nickels;
	   
   }

   /**
      Computes the number of pennies due to the customer.
      @return the number of pennies in the change due
   */
   public int givePennies()
   {
    change=change%5;
    int pennies=(int)change;
    return pennies;
   }

   //Pre:use purchase double
   //Post: return purchase double
public double getPurchase() {
	return purchase;
}

//Pre:use payment double
//Post: return payment double
public double getPayment() {
	return payment;
}


   
}
