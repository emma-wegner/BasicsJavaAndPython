
public class Greeter {
private String myName;

 public Greeter(String name)
 {
	myName=name;
 }
 
 public String greeting()
 {
	return ("Hello, "+myName);
 }
 
 public String goodbye()
 {
	 return ("Good Bye, "+myName);
 }
 
 public String refuseHelp() {
	 return("Sorry "+myName+ " I can't do that.");
}
 
}
