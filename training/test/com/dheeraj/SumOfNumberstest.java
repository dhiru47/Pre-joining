package com.dheeraj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumberstest {

	@Test
	void test() {
		SumOfNumbers sm=new SumOfNumbers();
		int start=1;
		int end=10;
		int actual=sm.sumOfEvenNumbers(start,end);
		int expected= 30;
		assertEquals(actual,expected);
	}

	void test2() {
		SumOfNumbers sm=new SumOfNumbers();
		int start=1;
		int end=10;
		int actual=sm.sumOfOddNumbers(start,end);
		int expected= 25;
		assertEquals(actual,expected);
	}
}
