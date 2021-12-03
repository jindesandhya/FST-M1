package com.ibm.B16_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	
	@Test
	
	public void qualification() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//ul/li//a[@class='firstLevelMenu'])[6]")).click();
		driver.findElement(By.linkText("Qualifications")).click();
		driver.findElement(By.id("addWorkExperience")).click();
		driver.findElement(By.id("experience_employer")).sendKeys("IBM");
		driver.findElement(By.id("experience_jobtitle")).sendKeys("Test Specialist");
		WebElement from = wait.until(ExpectedConditions.elementToBeClickable((By.id("experience_from_date"))));
		from.click();
		WebElement year = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(/html/body/div[3]/div/div/select[2]/option[90])"))));
		year.click();
		WebElement month = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//html/body/div[3]/div/div/select[1]/option[7])"))));
		month.click();
		WebElement date = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//html/body/div[3]/table/tbody/tr[4]/td[3]/a)"))));
		date.click();
		
		WebElement to = wait.until(ExpectedConditions.elementToBeClickable((By.id("experience_to_date"))));
		to.click();
		WebElement yearto = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(/html/body/div[3]/div/div/select[2]/option[100])"))));
		yearto.click();
		WebElement monthto = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//html/body/div[3]/div/div/select[1]/option[12])"))));
		monthto.click();
		WebElement dateto = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//html/body/div[3]/table/tbody/tr[5]/td[4]/a)"))));
		dateto.click();
		driver.findElement(By.id("btnWorkExpSave")).click();
		driver.close();
		
	}

}
