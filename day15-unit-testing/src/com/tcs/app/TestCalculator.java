package com.tcs.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@Test
	public void testAdd() {
		Calculator calculator =new Calculator();
		int actual=calculator.add(10,10);
		int expected=20;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testAdd2() {
		Calculator calculator =new Calculator();
		int result=calculator.add(10,10);
		boolean expected=true;
		boolean actual = result>0 && result<=20;
		assertTrue(expected==actual);
	}

}
