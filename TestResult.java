package com.sibisoft.northstar.tdd;

public class TestResult {

	int runCount;
	int errorCount;
	
	TestResult() {
		runCount = 0;
	}
	
	public void testStarted() {
		runCount += 1;
	}
	
	public void testFailed() {
		errorCount += 1;
	}
	
	public String summary() {
		return runCount+" run, "+errorCount+" failed"; 
	}
}
