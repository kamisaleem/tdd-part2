package com.sibisoft.northstar.tdd;

import java.lang.reflect.InvocationTargetException;

public class TestCase {

	String name;

	TestCase(String name) {
		this.name = name;
	}
	
	public void run() {
		try {
			this.getClass().getMethod(this.name).invoke(this);
		} catch (NoSuchMethodException ex) {
			System.out.println("No Such Method "+ex.toString());
		} catch (InvocationTargetException ex) {
			System.out.println("No Such Method "+ex.toString());
		} catch (IllegalAccessException ex) {
			System.out.println("No Such Method "+ex.toString());
		}
	}
}
