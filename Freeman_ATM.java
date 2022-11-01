package oop;

import java.io.*;
public class Freeman_ATM {
	
	
	public double Depo(double balance) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(balance==0)
		{
			System.out.println("Your current balance is 0");
		}
		System.out.println("Enter a valid deposit amount");
		double deposit = Double.parseDouble(br.readLine());
		balance = balance + deposit;
		return balance;
			
	}
	public double Withdraw(double balance) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the withdrawel amount");
		double withdrawl = Double.parseDouble(br.readLine());
		if(withdrawl>balance)
		{
			System.out.println("Your out of any balance amount");
		}
		else
		{
			balance = balance-withdrawl;
			System.out.println("You hav withdrawn Rs:"+withdrawl);
		}
		return balance;
	}
	public void status(double balance)
	{
		
		System.out.println("Your current balance "+balance);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Freeman_ATM obj = new Freeman_ATM();
		System.out.println("Welcome To Freeman's ATM");
		String Name;
		System.out.println("Enter ur Name");
		Name = br.readLine();
		System.out.println("Hello There "+Name);
		double balance = 0;
		int choice=0;
		while(true)
		{
			System.out.println("Press 1: To check the balance status");
			System.out.println("Press 2: To make a deposit");
			System.out.println("Press 3: To make a withdrawl");
			System.out.println("Enter ur choice");
			choice = Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1:	obj.status(balance); break;
				case 2: balance=obj.Depo(balance);
						System.out.println("Your current balance is "+balance); 
						break;
				case 3: balance = obj.Withdraw(balance);
						System.out.println("Your current balance is "+balance);
						break;
				default: System.out.println("Make a valid choice");
			}
		}
	}

}
