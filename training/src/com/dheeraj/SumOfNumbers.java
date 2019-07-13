package com.dheeraj;

import java.util.Scanner;

public class SumOfNumbers {
	
	public int sumOfEvenNumbers(int start,int end)
	{
		int sum=0;
		for(int i=start; i<=end;i++)
		{
			if(i %2 ==0)
				sum+=i;
		}
		return sum;
		
	}
	public int sumOfOddNumbers(int start,int end)
	{
		int sum=0;
		for(int i=start; i<=end;i++)
		{
			if(i %2 !=0)
				sum+=i;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.println("Starting number");
			int start=sc.nextInt();
			System.out.println("End number");
			int end=sc.nextInt();
			SumOfNumbers sm=new SumOfNumbers();
			System.out.println("sum of even numbers" + " " +sm.sumOfEvenNumbers(start,end));
			System.out.println("sum of odd numbers" + " " +sm.sumOfOddNumbers(start,end));
			
		}
		finally
		{
			sc.close();
		}

	}

}
