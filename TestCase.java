package com.sibisoft.northstar.tdd;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;

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
		result.testStarted();
		
		setup();
		try {
			this.getClass().getMethod(this.name).invoke(this);
		} catch (NoSuchMethodException ex) {
			System.out.println("No Such Method "+ex.toString());
		} catch (InvocationTargetException ex) {
			System.out.println("No Such Method "+ex.toString());
		} catch (IllegalAccessException ex) {
			System.out.println("No Such Method "+ex.toString());
		}
		
		this.tearDown();
		
		return result;
	}
	

	
	public void tearDown() {
		
	}

}
