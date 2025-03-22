import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

public class Pile {
	private ImageIcon myImage;
	private int marbleAmount;
	//constructor
	public Pile()
	 {
		 Random random=new Random();
		 marbleAmount=random.nextInt(90)+10;;
		 myImage= new ImageIcon("/Users/ewegner22/eclipse-workspace/Ap Comp Sci/src/marble.png");
	 }
//sets and gets objects
	public ImageIcon getMyImage() {
		return myImage;
	}

	public void setMyImage(ImageIcon myImage) {
		this.myImage = myImage;
	}

	public int getMarbleAmount() {
		return marbleAmount;
	}

	public void setMarbleAmount(int marbleAmount) {
		this.marbleAmount = marbleAmount;
	}
	
	 
}
