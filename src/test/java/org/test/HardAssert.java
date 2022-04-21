package org.test;

import org.testng.Assert;

import org.testng.annotations.Test;

public class HardAssert {
	@Test
	private void tc1() {
		System.out.println("1");

	}
	@Test
	public void tc2() {
		System.out.println("20");
		Assert.assertTrue(false);
		System.out.println("30");
		System.out.println("40");
	} 
	@Test
	public  void tc3() {
		System.out.println("50");
		System.out.println("60");
		System.out.println("70");

	}

}
