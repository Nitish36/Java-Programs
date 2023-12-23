package stringbuilder;
import java.io.*;
public class Example5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String");
		String str = br.readLine();
		System.out.println("Initial String is:");
		System.out.println(str);
		StringBuilder sb = new StringBuilder();
		String [] words = str.split(" ");
		for(String word : words)
		{
			String reverseWord = new StringBuilder(word).reverse().toString();
			sb.append(reverseWord+" ");
		}
		System.out.println("Reversed String is: ");
		System.out.println(sb);
	}
}