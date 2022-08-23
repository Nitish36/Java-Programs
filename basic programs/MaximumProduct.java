package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumProduct {

	public static int maximum(int arr[],int n)
	{
		if(n==1) {return arr[0];}
		int neg_max = Integer.MIN_VALUE;
		int count_zero=0,count_neg=0,prod=1;
		for(int i=0;i<n;i++)
		{
			if(arr[i] == 0)
			{
				count_zero++;
			}
			if(arr[i]<0)
			{
				count_neg++;
				neg_max = Math.max(neg_max, arr[i]);
			}
			prod = prod*arr[i];
		}
		if(count_zero==n)
		{
			return 0;
		}
		if(count_neg%2==1)
		{
			
		
		if(count_neg==1 && (count_neg+count_zero==n && count_zero>0))
		{
			return 0;
		}
		prod=prod/neg_max;
		}
		return prod;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of the array");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		int prod = maximum(arr,n);
		
		System.out.println("Minimum Product is "+prod);
		
	}

}
