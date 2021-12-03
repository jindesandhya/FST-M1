package com.ibm.B16_TestNG;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;



public class Activity1 {
	 
	 WebDriver driver;
 
	 
		@Test
		public void websitetitle() {
			driver = new FirefoxDriver();
			driver.get("http://alchemy.hguy.co:8080/orangehrm");
			String title = driver.getTitle();
			System.out.println("This is: " + title);
			Assert.assertEquals(title, "OrangeHRM");
			driver.close();
			
		}
			
	
		
}
