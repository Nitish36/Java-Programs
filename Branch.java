package practice;
import java.util.*;

enum sub
{
	CSE,ISE,CV,MECH
}
public class Branch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Most opted branch ");
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		sub ar[] = sub.values();
		if(ar[n-1] == sub.CSE)
		{
			System.out.println(ar[n-1].getClass());
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		sc.close();
		
		@SuppressWarnings("removal")
		Integer iob = new Integer(100);
		System.out.println(iob.toString()+" "+iob);
	}

}
