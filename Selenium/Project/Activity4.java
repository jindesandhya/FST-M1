package com.ibm.B16_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity4 {
	WebDriver driver;
	
	@Test
	
	public void addnewemployee() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		String expectedurl =  driver.getCurrentUrl();
		Assert.assertEquals(expectedurl, "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/dashboard");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		WebElement add = wait.until(ExpectedConditions.elementToBeClickable((By.id("btnAdd"))));
		add.click();
		WebElement firstname = wait.until(ExpectedConditions.elementToBeClickable((By.id("firstName"))));
		firstname.sendKeys("Sandhya Rani");
		WebElement lastname = wait.until(ExpectedConditions.elementToBeClickable((By.id("lastName"))));
		lastname.sendKeys("Ambaldhage");
		WebElement save = wait.until(ExpectedConditions.elementToBeClickable((By.id("btnSave"))));
		save.click();
		//driver.findElement(By.id("firstName")).sendKeys("Sandhya Rani");
		//driver.findElement(By.id("lastName")).sendKeys("Ambaldhage");
		//driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		WebElement employeesearch = wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("empsearch_employee_name_empName"))));
		employeesearch.sendKeys("Sandhya Rani Ambaldhage");
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable((By.id("searchBtn"))));
		search.click();
		//driver.findElement(By.id("searchBtn")).click();
		driver.close();
	}

}
