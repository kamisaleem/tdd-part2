package com.sibisoft.northstar.tdd;

public class WasRun extends TestCase {
	
	boolean wasRun;
	boolean wasSetup;
	String log;

	WasRun(String name) {
		super(name);
		this.wasRun = false;
		this.name = name;		
	}

	public void setup() {
		this.wasRun = false;
		wasSetup = true;
		log = new String("setUp ");
	}
	
	public void testMethod() {
		wasRun = true;
		log = new String (log + "testMethod ");
	}
	
	public void tearDown() {
		log = new String (log + "tearDown ");
	}
	
	public void testBrokenMethod() throws Exception {
		throw new java.lang.Exception();
	}
	
}
