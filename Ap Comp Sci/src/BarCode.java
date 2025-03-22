
public class BarCode {
	// |  |:|::   :|:|:  ||:::  :::||   :|::|  :::|| |
	//     9       5       0      1       4
	String code1=":::||";
	String code2="::|:|";
	String code3="::||:";
	String code4=":|::|";
	String code5=":|:|:";
	String code6=":||::";
	String code7="|:::|";
	String code8="|::|:";
	String code9="|:|::";
	String code0="||:::";
	 public String adressToZip(String addy)
	 {
		 String k=addy;
		 int sum=0;
		 int newDigit=0;
		 boolean first =true;
		 String zip="|";
		 for (int j=0; j<k.length();j++)
			{
				
				
				if (k.substring(j,j+1).equals("1"))
				{
					zip=zip+":::||";
					sum=sum+1;
				}
				
				else if (k.substring(j,j+1).equals("2"))
				{
					zip=zip+"::|:|";
					sum=sum+2;
				}
				
				else if (k.substring(j,j+1).equals("3"))
				{
					zip=zip+"::||:";
					sum=sum+3;
				}
				
				else if (k.substring(j,j+1).equals("4"))
				{
					zip=zip+":|::|";
					sum=sum+4;
				}
				
				else if (k.substring(j,j+1).equals("5"))
				{
					zip=zip+":|:|:";
					sum=sum+5;
				}
				
				else if (k.substring(j,j+1).equals("6"))
				{
					zip=zip+":||::";
					sum=sum+6;
				}
				else if (k.substring(j,j+1).equals("7"))
				{
					zip=zip+"|:::|";
					sum=sum+7;
				}
				else if (k.substring(j,j+1).equals("8"))
				{
					zip=zip+"|::|:";
					sum=sum+8;
				}
				else if (k.substring(j,j+1).equals("9"))
				{
					zip=zip+"|:|::";
					sum=sum+9;
				}
				else if (k.substring(j,j+1).equals("0"))
				{
					zip=zip+"||:::";
					sum=sum+0;
				}
				
			}
		    newDigit=10-sum%10;
		    if(newDigit==0)
		    	zip+=code0;
		    else if(newDigit==1)
		    	zip+=code1;
		    else if(newDigit==2)
		    	zip+=code2;
		    else if(newDigit==3)
		    	zip+=code3;
		    else if(newDigit==4)
		    	zip+=code4;
		    else if(newDigit==5)
		    	zip+=code5;
		    else if(newDigit==6)
		    	zip+=code6;
		    else if(newDigit==7)
		    	zip+=code7;
		    else if(newDigit==8)
		    	zip+=code8;
		    else if(newDigit==9)
		    	zip+=code9;
		    zip+="|";
		   return zip;
	 }
	 
	 public String zipToAdress(String zip)
	 {
		 String address="";
		 String partZip="";
		 for (int i=1; i<zip.length()-6;i+=5)
		 {
			partZip=zip.substring(i, i+5); 
			if(partZip.equals(code1))
			{
				address=address+1;
			}
			else if(partZip.equals(code2))
			{
				address=address+2;
			}
			else if(partZip.equals(code3))
			{
				address=address+3;
			}
			else if(partZip.equals(code4))
			{
				address=address+4;
			}
			else if(partZip.equals(code5))
			{
				address=address+5;
			}
			else if(partZip.equals(code6))
			{
				address=address+6;
			}
			else if(partZip.equals(code7))
			{
				address=address+7;
			}
			else if(partZip.equals(code8))
			{
				address=address+8;
			}
			else if(partZip.equals(code9))
			{
				address=address+9;
			}
			else if(partZip.equals(code0))
			{
				address=address+0;
			}
			
	     }
		 return address;
	 }
	 public boolean isBarCode(String bar)
	 {
		int counter=0;
		 if(bar.length()==32)
		 {
			 if (!(bar.substring(0,1).equals("|")))
			 {
				 return false;
			 }
			 if (!(bar.substring(31).equals("|")))
			 {
				 return false;
			 }
			 for(int j=1;j<bar.length()-1;j++)
			 {
				if(!(bar.substring(j,j+1).equals("|"))&&!(bar.substring(j,j+1).equals(":")))
				{
					return false;
				}
			 }
			 for(int j=1;j<bar.length()-1;j++)
			 {
				if(!(bar.substring(j,j+1).equals("|"))&&!(bar.substring(j,j+1).equals(":")))
				{
					return false;
				}
			 }
			 for(int m=1;m<bar.length()-6;m+=5)
			 {
				 for(int n=0;n<5;n++)
				 {
				  if(bar.substring(m+n,m+n+1).equals("|"))
				   {
					counter++;
				  }
				 }
				 if(!(counter==2))
				 {
					 return false;
				 }
				 counter=0;
			 }
		 }
		 else
		 {
			 return false;
		 }
		 return true;
	 }
}
