import java.util.Random;

import bridges.base.Color;
import bridges.base.ColorGrid;
import bridges.connect.Bridges;

public class SquareFill {
    public static void main(String[] args) throws Exception {

        // Put in your username and API Key below
        Bridges bridges = new Bridges(6, "ewegner22", "732737780094");

        bridges.setTitle("Square Fill Grid");
        bridges.setDescription("Fill the image with random colored squares.");
        /*
         * int rows and int columns you can change at the end to make the image bigger or smaller
         * start of with smaller numbers so you can keep track with all the pixels
         */
        int rows = 100;
        int columns = 100;

        int totalPixels = rows * columns;
        int filledPixels = 0;

        // initializes a value to check if a point is free or not
        float free = 0.0f;

        ColorGrid grid = new ColorGrid(rows, columns, new Color(255, 255, 255, free));

        // fill grid
        while (filledPixels < totalPixels) {
            /* TODO:
             * Part 1: Pick a random point on the grid and check
             *  if it has been filled yet or not.
             *
             * If not, set it to a random color and continue to the next step.
             * Else, generate a new point until you find a free one.
             */
        	
            boolean collision = false;
            int layers = 1;
            boolean set=false;
            int pointX = 0;
            int pointY=0;
            Random generator= new Random();
            do 
            {
        	pointX=generator.nextInt(rows);
        	pointY=generator.nextInt(columns);
        	if (grid.get(pointX, pointY).getAlpha()==free)
        	{
        		grid.set(pointX, pointY, new Color(generator.nextInt(255),generator.nextInt(255),generator.nextInt(255)));
        		set=true;
        		filledPixels++;
        	}
        	
            } while(!set);
            // begin adding layers
            while (!collision) {
                /* TODO:
                *  Part 2: store locations of the bottomLeft and topRight of current layer
                */
                 int bottomLeftX=pointX-layers;
                 int bottomLeftY=pointY+layers;
                 int topRightX=pointX+layers;
                 int topRightY=pointY-layers;
                /* TODO:
                 * Part 3: Check if the corners are out of bounds,
                 * if so, break and start a new square.
                 */
                 if(bottomLeftY>rows-1||bottomLeftX<0||topRightY<0||topRightX>columns-1)
                 {
                	break;
                 }
                int sideLength = 1 + (layers * 2);

                // collision check pass
              
                for (int i = 0; i < sideLength; i++) {
                    /* TODO:
                     * Part 4: Check the each side of the layer for collision with
                     * another square, if there is, escape the loops and
                     * generate a new central point at the beginning
                     */
                	if(grid.get(bottomLeftX+i, bottomLeftY).getAlpha()!=free||grid.get(topRightX-i, topRightY).getAlpha()!=free
                		||grid.get(bottomLeftX, bottomLeftY-i).getAlpha()!=free||grid.get(topRightX, topRightY+i).getAlpha()!=free)
                	{
                		collision=true;
                		break;
                	}
                	
                
                }

                // if collision on current layer, don't draw the layer
                if (collision){
                    continue;
                }
                /* TODO:
                 * Generate a new color to be used for this layer
                 */
                Color layerColor=new Color(generator.nextInt(255),generator.nextInt(255),generator.nextInt(255));
                
                for (int i = 0; i < sideLength; i++) {
                    /* TODO:
                     * Part 5: Go back over the layer and fill in the
                     * points with your generated color
                     * change your filledPixels variable
                     */
                	grid.set(bottomLeftX+i, bottomLeftY,layerColor);
                	grid.set(topRightX-i, topRightY,layerColor);
                    grid.set(bottomLeftX, bottomLeftY-i,layerColor);
                    grid.set(topRightX, topRightY+i,layerColor);
                   filledPixels=filledPixels+2;
                }
                filledPixels=filledPixels+(sideLength-2)*2;
                layers++;
            }
        }
        bridges.setDataStructure(grid);
        bridges.visualize();
    }
}