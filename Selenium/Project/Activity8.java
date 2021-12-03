package com.ibm.B16_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity8 {
	WebDriver driver;
	
	@Test
	public void applyleave() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//String expectedurl =  driver.getCurrentUrl();
		//Assert.assertEquals(expectedurl, "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/dashboard");
		driver.findElement(By.xpath("//html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[4]/div/a")).click();
		driver.findElement(By.id("applyleave_txtLeaveType")).click();
		WebElement leave = driver.findElement(By.id("applyleave_txtLeaveType"));
		Select type = new Select(leave);
		type.selectByValue("1");
		driver.findElement(By.id("applyleave_txtFromDate")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td[4]")).click();
		driver.findElement(By.id("applyleave_txtToDate")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[2]")).click();
		driver.findElement(By.id("applyBtn")).click();
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		String status=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[6]")).getText();
		System.out.println("Leave Status: "+status);
		driver.close();
	}
	

}
