	package com.testyantra.annotations;
	
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	public class Annotations2 extends Annotations3 {
	
		@Test
		public void tc_02() {
			System.out.println("Tc_02");
		}
		
	}
