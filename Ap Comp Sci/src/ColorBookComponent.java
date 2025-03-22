/*
* Name: Emma Wegner
* Date: May 26, 2020
*/

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class ColorBookComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
       
     // Strings
        Ellipse2D.Double string = new Ellipse2D.Double(100, 400, 300, 200);
        g2.draw(string);
        
        Ellipse2D.Double string2 = new Ellipse2D.Double(400, 400, 300, 200);
        g2.draw(string2);
        
        //Draw the mask (x,y,x-length, y-length) 
        Ellipse2D.Double mask = new Ellipse2D.Double(200, 200, 400, 400);
        g2.setColor(Color.WHITE);
        g2.fill(mask);
        g2.setColor(Color.BLACK);
        g2.draw(mask);
        g2.setColor(Color.WHITE);
        Rectangle box= new Rectangle(200,190,400,210);
        g2.draw(box);
        g2.fill(box);
        g2.setColor(Color.BLACK);
        g2.drawLine(200, 400, 600, 400);
        
        //Draw the face
        g2.drawLine(200, 270, 200, 400);
        g2.drawLine(600, 270, 600, 400);
        g2.drawArc(200, 170, 400, 200, -180, -180);
        
        //eyes
       
        g2.drawArc(450, 300, 100, 50, 180,180);
        
        //eyelash and eyelash
        for(int x=0;x<=200;x+=200)
        {
        g2.drawArc(250+x, 300, 100, 50, 180,180);
        g2.drawLine(265+x, 340, 240+x, 360);
        g2.drawLine(335+x, 340, 360+x, 360);
        g2.drawLine(280+x, 350, 260+x, 370);
        g2.drawLine(320+x, 350, 340+x, 370);
        g2.drawLine(300+x, 350, 300+x, 380);
        }
        
        //DrawHair
        g2.drawArc(400, 20, 400, 300, 180, 90);
        g2.drawArc(0, 20, 400, 300, 0, -90);
        
       //draws flowers
        int flowerY=0;
        int flowerX=0;
        for(int i=0; i<4;i++)
        {
           drawFlowers(g2,flowerX,flowerY);
           if (i==0)
           flowerX+=700;
           else if(i==1)
           {
        	   flowerY+=700;
           }
           else if(i==2)
           {
        	   flowerX-=700;
           }
        } 
        
        drawBubbleLetters(g2);
        
        
    }
    
    //draw flower
    public void drawFlowers(Graphics g, int x, int y)
    {
    	    Graphics2D g2 = (Graphics2D) g;
    		Random random= new Random();
           ImageIcon image = new ImageIcon ("/Users/ewegner22/eclipse-workspace/Ap Comp Sci/src/sunflower.jpg");
           if(random.nextInt(2)==1)
           image= new ImageIcon("/Users/ewegner22/eclipse-workspace/Ap Comp Sci/src/rose.jpg");
            g2.drawImage(image.getImage(), x, y, 100, 100,null);
    }
    //draws star
    public void drawBubbleLetters(Graphics g)
    {
    	 Graphics2D g2 = (Graphics2D) g;
    	//get text
         
         g2.setFont(new Font("myFont", Font.BOLD,130));
         g2.drawString("Stay", 250, 125);
         g2.drawString("Safe", 250, 700);
         
         g2.setColor(Color.WHITE);
         g2.setFont(new Font("myFont", Font.BOLD,123));
         g2.drawString("Stay", 252, 127);
         g2.drawString("Safe", 252, 702);
    }
    
}
        
