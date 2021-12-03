package com.ibm.B16_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity6 {
	WebDriver driver;
	
	@Test
	
	public void directorymenu() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul/li//a[@class='firstLevelMenu'])[9]"))).click();
		WebElement directory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li//a[@class='firstLevelMenu'])[9]")));
		directory.click();
		System.out.println(driver.findElement(By.xpath("//html/body/div[1]/div[3]/div[1]/div[1][@class='head']/h1")).getText().equalsIgnoreCase("Search Directory"));
		driver.close();
		
		
		
	}

}
