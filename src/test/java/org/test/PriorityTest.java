package org.test;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 4,invocationCount = 5)
	public void Tc1() {
		System.out.println("1");
	}
	@Test(priority = 3)
	public void Tc2() {
		System.out.println("2");

	}
	@Test (priority = 2)
	public void Tc3() {
        System.out.println(3);
	}
}
