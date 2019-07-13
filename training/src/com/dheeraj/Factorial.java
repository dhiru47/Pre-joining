package com.dheeraj;

import java.util.Scanner;

public class Factorial {
	public int factorial(int n)
	{
		if(n==0)
			return 1;
		
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.println("Enter the number");
			int num=sc.nextInt();
			Factorial f=new Factorial();
			System.out.println("Factorial of Number is " + " " + f.factorial(num));
			
		}
		finally
		{
			sc.close();
		}

	}

}
