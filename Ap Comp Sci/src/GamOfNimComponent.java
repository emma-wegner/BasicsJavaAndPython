
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.Font;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Image;
	import java.awt.Rectangle;
	import java.awt.geom.Ellipse2D;
	import java.util.ArrayList;
	import java.util.Random;

	import javax.swing.ImageIcon;
	import javax.swing.JComponent;

	/*
	* Name: Emma Wegner
	* Date: May 9, 2019
	* Program Name: SnakeComponent.java
	* Description : 
	*/

	public class GamOfNimComponent extends JComponent 
	{
		   Pile pile=new Pile();
		private int marbleX=20;
	    private int marbleY=20;
	    private Image marbleImage=pile.getMyImage().getImage();
       private static final int MARBLE_BLOCK_LENGTH=10;
	    


	  private Dimension d= new Dimension (800,800);
	    
	    
	 //Component
	    public GamOfNimComponent()
	    {
	        super();
	        this.setPreferredSize(d);
	    }
	    

	    //Pre: uses paint images
	    //post:paints the marbles 
	    public void paintComponent(Graphics g)
	    {
	        Graphics2D g2= (Graphics2D)g;
	        
	        
	        {
         
	        for (int i=0; i<pile.getMarbleAmount();i++)
	        {
	        	g2.drawImage(marbleImage, marbleX, marbleY,MARBLE_BLOCK_LENGTH, MARBLE_BLOCK_LENGTH, this);
	        	marbleX+=20;
	        	marbleY+=20;
	        }
	        
    
	        }
	    }
	    
	}

