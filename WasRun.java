package com.sibisoft.northstar.tdd;

public class WasRun extends TestCase {
	
	boolean wasRun;

	WasRun(String name) {
		super(name);
		this.wasRun = false;
		this.name = name;		
	}

	public void testMethod() {
		wasRun = true;
	}

}
