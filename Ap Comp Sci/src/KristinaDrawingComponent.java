import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class KristinaDrawingComponent extends JComponent{
	  public void paintComponent(Graphics g)
	    {
	        //Recover Graphics2D
	        Graphics2D g2 = (Graphics2D) g;
	        
	     // Moon
	        g2.setColor(Color.white);
	        Ellipse2D.Double moon= new Ellipse2D.Double(100, 100, 300, 300);
	        g2.draw(moon);
	        g2.fill(moon);
	        
	        g2.setColor(Color.black);
	        Ellipse2D.Double oppositeMoon= new Ellipse2D.Double(200, 100, 300, 300);
	        g2.draw(oppositeMoon);
	        g2.fill(oppositeMoon);
	        
	        //make star
	        g2.setColor(Color.white);
	        Polygon triangle= new Polygon(new int[] {400,550,700}, new int[] {400,100,400}, 3);
	        Polygon triangle2= new Polygon(new int[] {400,550,700}, new int[] {200,500,200}, 3);
	        g2.draw(triangle2);
	        g2.draw(triangle);
	        g2.fill(triangle);
	        g2.fill (triangle2);
	    }
}
