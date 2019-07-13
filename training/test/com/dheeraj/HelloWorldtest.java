package com.dheeraj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldtest {

	@Test
	void test() {
		HelloWorld hw=new HelloWorld();
		String actual=hw.getMessage("HelloWorld");
		String expected="HelloWorld";
		assertEquals(actual,expected);
		
	}

}
