package com.dheeraj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Factorialtest {

	@Test
	void test() {
		Factorial f=new Factorial();
		int n=4;
		int actual=f.factorial(n);
		int expected= 24;
		assertEquals(actual,expected);
	}

}
