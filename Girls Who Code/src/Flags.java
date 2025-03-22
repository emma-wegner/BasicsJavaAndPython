import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Flags {
	 private ArrayList<Flag> FlagsList = new ArrayList<Flag>();
	 public Flags()
	 {
		 
	  FlagsList.add(new Flag("United States Of America",new ImageIcon
			  ("/Users/ewegner22/eclipse-workspace/Girls Who Code/src/US.png")));
	  FlagsList.add(new Flag("Great Britian",new ImageIcon
			  ("/Users/ewegner22/eclipse-workspace/Girls Who Code/src/GB.png")));
	 }
	
}
