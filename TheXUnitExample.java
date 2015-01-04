package com.sibisoft.northstar.tdd;

import org.junit.Test;

public class TheXUnitExample {

/*	@Test
	public void testMethod() {
		WasRun test = new WasRun();
		System.out.println(test.wasRun);
		test.testMethod();
		System.out.println(test.wasRun);
	}*/
	
	@Test
	public void testRun() {
		WasRun test = new WasRun("testMethod");
		System.out.println(test.wasRun);
		test.run();
		System.out.println(test.wasRun);
	}
}
