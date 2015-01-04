package com.sibisoft.northstar.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCaseTest {
	
	@Test
	public void testRunning() {
		WasRun test = new WasRun("testMethod");
		assertFalse(test.wasRun);
		test.run();
		assertTrue(test.wasRun);
	}
}
