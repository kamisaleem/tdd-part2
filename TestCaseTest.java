package com.sibisoft.northstar.tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestCaseTest {
	
	WasRun test = null;
	
	@Test
	public void testRunning() {
		test.run();
		assert(test.wasRun);
	}
	
	@Before
	public void testSetup() {
		test = new WasRun("testMethod");
		test.run();
		assertTrue(test.wasSetup);
	}
	
}
