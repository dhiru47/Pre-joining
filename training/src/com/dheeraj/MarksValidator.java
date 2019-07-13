package com.dheeraj;

import java.util.Scanner;

public class MarksValidator {
	public void markGrade(int mark)
	{
		switch(mark/10)
		{
		case 9: if(mark>90)
		
				{
					System.out.println("Grade is A");
					break;
					}
		case 8:
		case 7: if(mark>75)
		{
			System.out.println("Grade is B");
			break;
		}
		case 6 : if(mark>60)
		{
			System.out.println("Grade is C");
			break;
		}
		default:
			System.out.println("Grade is D");
			
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.println("Enter the marks");
			int marks=sc.nextInt();
			MarksValidator mv=new MarksValidator();
			mv.markGrade(marks);
			
		}
		finally
		{
			sc.close();
		}


	}

}
