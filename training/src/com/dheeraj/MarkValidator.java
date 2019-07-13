package com.dheeraj;
import java.util.*;

public class MarkValidator {
	public boolean isPass(int marks)
	{
		if(marks>=40)
		{
			return true;
		}
		else
			return false;
	}
	public String markGrade(int mark) 
	{
		String grade=null;
		if(mark>90) {
			grade="A";
		}
		else if(mark>75)
			grade="B";
		else if(mark>60)
			grade="C";
		else
			grade="D";
		return grade;
			
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.println("Enter the marks");
			int marks=sc.nextInt();
			MarkValidator mv=new MarkValidator();
			System.out.println(mv.isPass(marks));
			System.out.println(mv.markGrade(marks));
			
		}
		finally
		{
			sc.close();
		}

	}

}
