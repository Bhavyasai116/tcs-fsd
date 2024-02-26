package com.tcs.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator2 {
	static Calculator calculator;
	
	@Before
	static void setUpBeforeClass() throws Exception {
		calculator=new Calculator();
		System.out.println("Before All");
	}
 
	@After
	static void tearDownAfterClass() throws Exception {
		calculator=null;
		System.out.println("After All");
	}
 
	@Before
	void setUp() throws Exception {
		System.out.println("Before each");
	}
 
	@After
	void tearDown() throws Exception {
		System.out.println("After Each");
	}
 
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
