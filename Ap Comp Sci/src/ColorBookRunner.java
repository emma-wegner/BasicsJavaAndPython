/* Name: Emma Wegner
* Date: May 26, 2020
* Program Name: HalloweenViewer.java
* Description : 
*/

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class ColorBookRunner
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();      
        frame.setSize(800, 800);
        frame.setTitle("Coloring Book");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //centers the screen
        
        
        ColorBookComponent component = new ColorBookComponent();
        frame.add(component);
        Container c = frame.getContentPane();
        c.setBackground(Color.WHITE);
        
        frame.setVisible(true);
    }
}
