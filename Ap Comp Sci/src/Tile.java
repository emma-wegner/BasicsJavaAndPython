public class Tile {
	private String image;
	private boolean faceUp;
	
	/** 
	 * Constructs a Tile whose faceUp shows word.
	 * @param word is the string on the Tile
	 */
	public Tile(String word) {
		image = word;
		faceUp = false;
	}
	
	/**
	 * Shows image on face-up Tile.
	 * @return image if Tile is face-up; otherwise
	 * return the empty string
	 */
	public String showFace() {
		if (faceUp)
		{
			return image;
		}
		else
		{
			return "_";
		}
	}    
	
	/**
	 * Checks whether Tile is face-up.
	 * @return true if Tile is face-up, false otherwise
	 */
	public boolean isFaceUp() {
		if (faceUp)
			return true;
		    return false;
	}
	
	/**
	 * Compares images on Tiles.
	 * @param other image to be compared to image on this tile
	 * @return true if the image on other is the same as this
	 * image; false otherwise
	 */
public boolean equals(Object other) {
		   if(image.equals(other))
		   {
			   return true;
		   }
		   return false;
	}
	
	/**
	 * Turns Tile face-up.
	 * Post condition: Tile is turned face-up.
	 */
	
	public void turnFaceUp() {
		faceUp=true;
		//showFace();
		
	}
	
	/**
	 * Turns Tile face-down.
	 * Postcondition: Tile is turned face-down.
	 */
	public void turnFaceDown() {
		faceUp=false;
		//showFace();
		
	}
}


