package org.test;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	@BeforeClass
	public void beforeclass() {
		System.out.println("Launch Browser");

	}
	@BeforeMethod
	public void beforeEackMe() {
		Date d = new  Date();	
		System.out.println("start time"+ d);

	}
	@AfterMethod
	public void aftcerMthod() {
		Date d = new Date ();
		System.out.println("Close Browser" + d);

	}
	@AfterClass
	public void afterEachClass() {
		System.out.println("CLose Brower");
	}
	@Test
	 public void test() {
   System.out.println("TC1");
	}
}
