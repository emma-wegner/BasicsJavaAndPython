import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		//fills arrayList with words
		int lastSpace=0;
		ArrayList <String>words= new ArrayList<String>();
		for(int i=0; i<sentence.length();i++)
		{
			if(sentence.substring(i, i+1).equals(" "))
			{
				words.add(sentence.substring(lastSpace,i));
				lastSpace=i+1;
			}
		}
		words.add(sentence.substring(lastSpace));
		
		//transfers words from arrayList to array
		wordRay=new String[words.size()];
		for  (int m=0; m<words.size();m++)
		{
			wordRay[m]=words.get(m);
		}
	}

	public void sort()
	{
		int min;
		for(int index=0;index<wordRay.length;index++)
		{
			min=findMin(index);
			swap(index,min);
		}
	}
	
	public int findMin(int index)
	{
		int minIndex=index;
		for(int i=minIndex;i<wordRay.length;i++)
		{
			if (wordRay[i].compareTo(wordRay[minIndex])<0)
			{
				minIndex=i;
			}
		}
		return minIndex;
	}
	public String toString()
	{
		String output="";
		for  (int m=0; m<wordRay.length;m++)
		{
			output+=wordRay[m]+"\n";
		}
		return output+"\n\n";
	}
	public void swap(int one, int two)
	{
		String temp=wordRay[one];
		wordRay[one]=wordRay[two];
		wordRay[two]=temp;
	}
}