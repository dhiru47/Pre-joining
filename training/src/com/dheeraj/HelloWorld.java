package com.dheeraj;


public class HelloWorld {
	
	public String getMessage(String str)
	{
		return str;
	}


	public static void main(String[] args) {
		System.out.println("Hello");
		HelloWorld hw= new HelloWorld();
		String str= "HelloWorld";
		System.out.println(hw.getMessage(str));

	}
}

	