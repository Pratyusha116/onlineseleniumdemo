package com.testyantra.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations extends Annotations3 {

	
	@Test
	public void tc_01() {
		System.out.println("Tc_01");
	}
	@BeforeMethod
	public void beforeethod() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
}
