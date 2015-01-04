package com.sibisoft.northstar.tdd;

public class TestCase {

	String name;

	TestCase(String name) {
		this.name = name;
	}
	
	public void setup() {
		WasRun test = new WasRun("testMethod");
	}
	
	public TestResult run() {
		
		TestResult result = new TestResult();
		try {
			result.testStarted();
				
			setup();
			this.getClass().getMethod(this.name).invoke(this);
			
		} catch (Exception ex) {
			result.testFailed();
		} 
		this.tearDown();
		
		return result;
	}
	
	public void tearDown() {
		
	}

}
