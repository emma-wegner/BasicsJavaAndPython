
public class TopLeftColumnRow implements Cipher {
  NumberFacts facts=new NumberFacts();
	
 
@Override
public String encode(String original) {
	
		int x;
        String newStr="";
		if(facts.isPerfectSquare(original.length()))
		{
			 x=(int)(Math.sqrt(original.length()));
		}
		else
		{
         x=((int)(Math.sqrt(original.length())))+1;
		}
		int index=0;
	String[][] mat=new String[x][x];
	for (int r=0; r<mat.length;r++)
	   {
		   for (int c=0; c<mat.length;c++)
		   {
			   if(index>=original.length())
			   {
				  mat[r][c]="*"; 
			   }
			   else
			   {
			   mat[r][c]=original.substring(index,index+1);
			   }
			   index++;
		   }
	   }
	
	for (int c=0; c<mat.length;c++)
	   {
		   for (int r=0; r<mat.length;r++)
		   {
			   newStr+=mat[r][c];
		   }
	   }
	return newStr;
}
@Override
public String decode(String encoded) {
	int x;
    String oldStr="";
		 x=(int)(Math.sqrt(encoded.length()));
	
			int index=0;
			String[][] mat=new String[x][x];
			for (int c=0; c<mat.length;c++)
			   {
				   for (int r=0; r<mat.length;r++)
				   {
					
					   mat[r][c]=encoded.substring(index,index+1);
					   index++;
				   }
			   }

for (int r=0; r<mat.length;r++)
   {
	   for (int c=0; c<mat.length;c++)
	   {
		   if(!(mat[r][c].equals("*")))
		   {
			   oldStr+=mat[r][c];
		   }
		 
		  
	   }
   }
return oldStr;
}
  
  
}
