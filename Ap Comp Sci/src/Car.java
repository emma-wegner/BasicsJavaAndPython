import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.ImageIcon;

public class Car extends Vehicle{
 
	@Override
	public void draw(Graphics2D g2) {

		Random Genx = new Random();
		int newX=Genx.nextInt(500);
		int newY=Genx.nextInt(500);
        g2.setColor(Color.BLACK);
       ImageIcon image = new ImageIcon ("/Users/ewegner22/eclipse-workspace/Ap Comp Sci/src/car.png");///Users/ewegner22/eclipse-workspace/Ap Comp Sci/src/car.png
        g2.drawImage(image.getImage(), newX, newY, getWidth(), getHeight(),null);
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 100;
	}

}