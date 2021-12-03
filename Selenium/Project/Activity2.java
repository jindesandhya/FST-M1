package com.ibm.B16_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class Activity2 {
		
		WebDriver driver;
	@Test
	
	public  void headerurl() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm");
		WebElement img = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		System.out.println("Src attribute is: "+ img.getAttribute("src"));
		driver.close();

	}

}
