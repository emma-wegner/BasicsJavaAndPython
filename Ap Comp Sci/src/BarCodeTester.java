import java.util.Scanner;

public class BarCodeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Scanner out=  new Scanner(System.in);
	    boolean end=false;
	    boolean end2=false;
	     String c="";
	    String b="";
	    BarCode bar=new BarCode();
	    while(!end)
	    {
		  System.out.println("Please enter a ZipCode: ");
		  c=in.nextLine();
		  if (c.length()==5)
		  {
			  end=true;
		  }
	    }
	    while(!end2)
	    {
		  System.out.println("Please enter a BarCode: ");
		  b=out.nextLine();
		  if(bar.isBarCode(b))
		  {
			  end2=true;
		  }
	    }

	      System.out.println(bar.adressToZip(c));
	      System.out.println(bar.zipToAdress(b));
	}

}
