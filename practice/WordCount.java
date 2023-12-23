package methods;
import java.util.*;
import java.util.Arrays;
public class WordCount {
	
	public static int getWordsAmount(String text)
	{
		String a=Arrays.toString(text.toCharArray());
		char b[]=a.toCharArray();
		int length=b.length;
		int wordCount=0;
		for(int i=0;i<length;i++)
		{
			if(b[i]==' ')
				wordCount=wordCount+1;
		}
		return wordCount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		text=sc.next();
		int ctr=0;
		ctr=getWordsAmount(text);
		System.out.println("Word count present in string is "+ctr);
		sc.close();
	}

}
