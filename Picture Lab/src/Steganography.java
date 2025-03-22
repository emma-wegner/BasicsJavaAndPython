import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;
public class Steganography {
	
   public static void clearLow (Pixel p)
 {
	p.setRed((p.getRed()/4)*4);
	p.setBlue((p.getBlue()/4)*4);
	p.setGreen((p.getGreen()/4)*4);

 }
   public static Picture testClearLow(Picture p)
   {
	   Pixel[][] pixels = p.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        clearLow(pixelObj);
	      }
	    } 
	   return p;
	   
   }
   
   public static void setLow(Pixel p, Color c)
   {
	   int lowestBitR=(c.getRed()/64);
	   int lowestBitG=(c.getGreen()/64);
	   int lowestBitB=(c.getBlue()/64);
	   clearLow(p);
	   p.setRed(p.getRed()+ lowestBitR);
	   p.setGreen(p.getGreen()+ lowestBitG);
	   p.setBlue(p.getBlue()+ lowestBitB);
   }
   
   public static Picture testSetLow(Picture p, Color c)
   {
	   Pixel[][] pixels = p.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        setLow(pixelObj, c);
	        
	      }
	    } 
	   return p;
	   
   }
   
   public static Picture revealPicture (Picture hidden)
   {
	   Picture copy= new Picture (hidden);
	   Pixel[][] pixels=copy.getPixels2D();
	   Pixel[][] source=hidden.getPixels2D();
	   for (int r=0; r<pixels.length; r++)
	   {
		   for (int c=0; c<pixels[0].length; c++)
		   {
		   Color col=source[r][c].getColor();
		   Pixel p=pixels[r][c];
		   p.setRed(col.getRed()%4 *64);
		   p.setGreen(col.getBlue()%4 *64);
		   p.setBlue(col.getGreen()%4 *64);
		   }
	   }
	   return copy;
   }
   
   public static boolean canHide(Picture source, Picture secret)
   {
	   if(source.getWidth()>=secret.getWidth()&&source.getHeight()>=secret.getHeight())
		   return true;
	  return false;
   }
   
    public static Picture hidePicture(Picture source, Picture secret, int startRow, int startColumn)
   {
	   Picture copy= new Picture (source);
	   Pixel[][] pixels=copy.getPixels2D();
	   Pixel[][] secrets=secret.getPixels2D();
	   for (int r=0; r<secrets.length; r++)
	   {
		   for (int c=0; c<secrets[0].length; c++)
		   {
		  clearLow(pixels[r+startRow][c+startColumn]);
		  pixels[r+startRow][c+startColumn].setRed(pixels[r+startRow][c+startColumn].getRed()+secrets[r+startRow][c+startColumn].getRed()/64);
		  pixels[r+startRow][c+startColumn].setGreen(pixels[r+startRow][c+startColumn].getGreen()+secrets[r+startRow][c+startColumn].getGreen()/64);
		  pixels[r+startRow][c+startColumn].setBlue(pixels[r+startRow][c+startColumn].getBlue()+secrets[r+startRow][c+startColumn].getBlue()/64);
		   }
	   }
	   return copy;
	  
   }
    
    public static boolean isSame(Picture one, Picture two)
    {
    	 Picture copy= new Picture (one);
    	Pixel[][] onePix=copy.getPixels2D();
  	   Pixel[][] twoPix=two.getPixels2D();
  	   if (one.getHeight()!=two.getHeight()||one.getWidth()!=two.getWidth())
  	   {
  		   return false;
  	   }
  	   for (int r=0; r<twoPix.length; r++)
  	   {
  		   for (int c=0; c<twoPix[0].length; c++)
  		   {
  		      if (!(onePix[r][c].getRed()==twoPix[r][c].getRed()&&onePix[r][c].getBlue()==twoPix[r][c].getBlue()
  		    		  &&onePix[r][c].getGreen()==twoPix[r][c].getGreen()))
  		      {
  		    	return false;
  		      }
  		   }
  	   }
  	   return true;
    }
    
    public static
    
   public static void main(String[] args)
   {
	   Picture beach3 = new Picture("beach.jpg");
	    Picture flower= new Picture("flower1.jpg");
	    if(canHide(beach3,flower))
	    {
	    	Picture copy4=hidePicture(beach3,flower,100,100);
	    	copy4.explore();
            Picture copy5=revealPicture(copy4);
            copy5.explore();
	    }
   }
   
   

}
