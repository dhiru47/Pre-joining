package com.dheeraj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatortest {

	@Test
	void test() {
		MarkValidator mv=new MarkValidator();
		int mark=40;
		boolean actual=mv.isPass(mark);
		boolean expected= true;
		assertEquals(actual,expected);
	}
		
	
	void test2() {
			MarkValidator mv=new MarkValidator();
			int mark=91;
			String actual=mv.markGrade(mark);
			String expected= "A";
			assertEquals(actual,expected);
		}
	

}
