package com.dheeraj;
import java.util.*;
public class Temperature {
	public float convertToFarenheit(int celcius)
	{
		float  far=(celcius * 9.0f/5.0f) + 32;
		return far;
	}
	public float convertToCelcius(float farhen)
	{
		float cel=(farhen-32.0f) * 5.0f / 9.0f;
		return cel;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the value of celcius");
		int cel=sc.nextInt();
		System.out.println("Enter the value of Farenheit");
		float farh=sc.nextFloat();
		Temperature tm=new Temperature();
		System.out.println(cel + " Celcius Converted to Farhenheit" + " " + tm.convertToFarenheit(cel));
		System.out.println(farh +" Farhenheit Converted to Celcius" + " " + tm.convertToCelcius(farh));
		}
		finally
		{
			sc.close();
		}

	}

}
