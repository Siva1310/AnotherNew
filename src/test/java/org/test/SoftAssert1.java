package org.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	@Test
	
	
	public void Tc1() {
          System.out.println("1");
                
	}
	@Test
	public void Tc2() {
         System.out.println("100");
         System.out.println("200");
         SoftAssert s = new SoftAssert();
         // s.assertTrue(false);
         s.assertAll();
         System.out.println("300");
         System.out.println("500");
         System.out.println("600");
	}
	@Test
	public void tc3() {
		System.out.println("1000");
 
	}
	
}
