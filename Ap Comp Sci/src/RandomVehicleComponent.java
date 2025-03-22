import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

/**
   Draws cars and trucks in random order.
*/
public class RandomVehicleComponent extends JComponent
{
   private Vehicle one;
   public RandomVehicleComponent()
   {
      super();
      
   }

   public void paintComponent(Graphics g)
   {
	   Graphics2D g2= (Graphics2D)g;
   for(int i=0; i<10;i++) {
	   Vehicle vec=randomVehicle();
	   vec.draw(g2);
   }
	   
   }

   public Vehicle randomVehicle()
   {
	    
	   Random generator = new Random();
	   int x=generator.nextInt(2);
	   if (x==0)
	   {
		   one=new Car();
		   return one;
	   }
	   else {
		   one=new Truck();
		   return one;
	   }
	   
   }

   
}
