package com.ibm.B16_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	
	@Test
	public void emergencycontacts() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("(//ul/li//a[@class='firstLevelMenu'])[6]")).click();
		//driver.findElement(By.linkText("Emergency Contacts")).click();
		driver.findElement(By.xpath("//ul[@id='sidenav']//li/a[contains(text(),'Emergency')]")).click();
	    List<WebElement> contactlist = driver.findElements(By.xpath("//ul[@id='ListViewInner']/li"));
	    	    for( WebElement list : contactlist)
	    	    {
	    	    System.out.println(list.getText());
	    	    }
	}

}
