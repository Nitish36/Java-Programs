package practice;
import java.util.*;
public class Conversion {
	
	public static void calc(int num1,int num2)
	{
		String binary,oct,hexa;
		System.out.println("Decimal\tBinary\tOctal\tHexadecimal");
		for(int i = num1;i<=num2;i++)
		{
			binary = Integer.toBinaryString(i);
			oct = Integer.toOctalString(i);
			hexa = Integer.toHexString(i);
			
			System.out.println(i+"\t"+binary+"\t"+oct+"\t"+hexa);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter a start range of a number");
		num1 = sc.nextInt();
		System.out.println("Enter a end range of a number");
		num2 = sc.nextInt();
		calc(num1,num2);
		sc.close();
	}

}
