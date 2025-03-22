public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister(0, 0,0);

      register.recordPurchase(8.37);
      register.enterPayment(10, 0, 0, 0, 0);
      if (register.getPayment()<register.getPurchase())
      {
    	 System.out.println("The customer owes more money");
      }
      System.out.println("Dollars: " + register.giveDollars());
      System.out.println("Expected: 1");
      System.out.println("Quarters: " + register.giveQuarters()); 
      System.out.println("Expected: 2");
      System.out.println("Dimes: " + register.giveDimes()); 
      System.out.println("Expected: 1");
      System.out.println("Nickels: " + register.giveNickels()); 
      System.out.println("Expected: 0");
      System.out.println("Pennies: " + register.givePennies()); 
      System.out.println("Expected: 3");

      
   }
}
