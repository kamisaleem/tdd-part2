package com.sibisoft.northstar.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCaseTest {
	
	WasRun test = null;
	TestResult result;
	
	@Test
	public void testTemplateMethod() {		
		test = new WasRun("testMethod");
		result = test.run();
		assertEquals("setUp testMethod tearDown ", test.log);
		assertTrue(test.wasSetup);
	}
	
	@Test
	public void testResult() {
		test = new WasRun("testMethod");
		result = test.run();
		assertEquals("1 run, 0 failed", result.summary());
	}
	
	@Test
	public void testFailedResult() {
		test = new WasRun("testMethod");
		result = test.run();
		//assertEquals("1 run, 1 failed", result.summary());
	}
	
}
