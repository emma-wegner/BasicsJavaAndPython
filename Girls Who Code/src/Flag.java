import javax.swing.ImageIcon;

public class Flag {
private String name;
private static ImageIcon image;

public Flag(String n, ImageIcon i)
{
	name=n;
	image=i;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static ImageIcon getImage() {
	return image;
}
public static void setImage(ImageIcon image) {
	Flag.image = image;
}
}
