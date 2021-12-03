package com.ibm.B16_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity3 {
	WebDriver driver;
	@Test
	
	public void login() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		String expectedurl =  driver.getCurrentUrl();
		Assert.assertEquals(expectedurl, "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/dashboard");
		driver.close();
	}

}
