package practice;
public class Class
{
	public static void main(String[]args)
	{
		char chars[]= {'S','o','m','e','S','t','r','i','n','g'};
		int startIndex = 4;
		int numChars = 6;
		System.out.println(String.valueOf(chars,startIndex,numChars));
	}
}