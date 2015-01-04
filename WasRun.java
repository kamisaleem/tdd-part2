package com.sibisoft.northstar.tdd;

public class WasRun extends TestCase {
	
	boolean wasRun;
	boolean wasSetup;

	WasRun(String name) {
		super(name);
		this.wasRun = false;
		this.name = name;		
	}

	public void testMethod() {
		wasRun = true;
	}
	
	public void setup() {
		this.wasRun = false;
		wasSetup = true;
	}
	
}
