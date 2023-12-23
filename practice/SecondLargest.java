package methods;
import java.util.*;
public class SecondLargest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i = 0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Final Array");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Largest And smallest element in the array is ");
		System.out.println("Smallest element :"+arr[0]);
		System.out.println("Largest element :"+arr[n-1]);
		System.out.println("Second largest element :"+arr[n-2]);
		sc.close();
	}

}
