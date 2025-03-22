
public class Celebrity {
   String name;
   String hint;
   public Celebrity()
   {
	   name="";
	   hint="";
   }
   
   public Celebrity(String n, String h)
   {
	   name=n;
	   hint=h;
   }
public String getAnswer() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClue() {
	return hint;
}
public void setClue(String hint) {
	this.hint = hint;
}


   
}
