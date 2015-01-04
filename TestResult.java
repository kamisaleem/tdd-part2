package com.sibisoft.northstar.tdd;

public class TestResult {

	int runCount;
	
	TestResult() {
		runCount = 0;
	}
	
	public void testStarted() {
		runCount = runCount + 1;
	}
	
	public String summary() {
		return runCount+" run, 0 failed"; 
	}
}
