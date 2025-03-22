import java.awt.List;

public class Array2D {
   int mulptiplicationTable[][]=new int[5][5];
   public Array2D()
   {
	   for (int r=1; r<=mulptiplicationTable.length;r++)
	   {
		   for (int c=1; c<=mulptiplicationTable.length;c++)
		   {
			  mulptiplicationTable[c][r]=r*c;
			  
	       }
		   System.out.println();
       }   
   }
   
   public void printTable()
   {
	   for (int r=0; r<mulptiplicationTable.length;r++)
	   {
		   for (int c=0; c<mulptiplicationTable.length;c++)
		   {
			   System.out.print(mulptiplicationTable[c][r]+" ");
	       }
		   System.out.println();
       }   
   }
   
   public void sumRow()
   {
	   int sum=0;
	   for (int r=0; r<mulptiplicationTable.length;r++)
	   {
		   for (int c=0; c<mulptiplicationTable.length;c++)
		   {
			  sum=sum+mulptiplicationTable[r][c];
	       }
		   System.out.println("Row "+r+" sum: "+ sum);
		   sum=0;
       }
   }
   public void columnRow()
   {
	   int sum=0;
	   for (int c=0; c<mulptiplicationTable.length;c++)
	   {
		   for (int r=0; r<mulptiplicationTable.length;r++)
		   {
			  sum=sum+mulptiplicationTable[r][c];
	       }
		   System.out.println("Column "+c+" sum: "+ sum);
		   sum=0;
       }
   }
   
   public void sumAll()
   {
	   int sum=0;
	   for (int r=0; r<mulptiplicationTable.length;r++)
	   {
		   for (int c=0; c<mulptiplicationTable.length;c++)
		   {
			   sum=mulptiplicationTable[c][r];
	       }
       }
	  System.out.println(sum);
   }
   
}
