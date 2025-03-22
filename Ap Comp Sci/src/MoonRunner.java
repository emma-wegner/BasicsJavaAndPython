
   import java.awt.Color;
	import java.awt.Container;

	import javax.swing.JFrame;
	
      public class MoonRunner
   {
	    public static void main(String[] args)
	    {
	        JFrame frame = new JFrame();      
	        frame.setSize(800, 800);
	        frame.setTitle("Moon");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null); //centers the screen
	        
	        
	        KristinaDrawingComponent component = new KristinaDrawingComponent();
	        frame.add(component);
	        Container c = frame.getContentPane();
	        c.setBackground(Color.BLACK);
	        
	        frame.setVisible(true);
	    }
	}


