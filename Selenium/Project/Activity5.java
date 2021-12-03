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

public class Activit5 {
	WebDriver driver;
	
	@Test
	
	public void edituser() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//ul/li//a[@class='firstLevelMenu'])[6]")).click();
		driver.findElement(By.id("btnSave")).click();
		WebElement fstname = wait.until(ExpectedConditions.elementToBeClickable((By.id("personal_txtEmpFirstName"))));
		fstname.clear();
		fstname.sendKeys("Ani");
		WebElement lastname = wait.until(ExpectedConditions.elementToBeClickable((By.id("personal_txtEmpLastName"))));
		lastname.clear();
		lastname.sendKeys("S");
		WebElement gendermale = wait.until(ExpectedConditions.elementToBeClickable((By.id("personal_optGender_1"))));
		gendermale.click();
		WebElement dob = wait.until(ExpectedConditions.elementToBeClickable((By.id("personal_DOB"))));
		dob.click();
		WebElement year = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//html/body/div[3]/div/div/select[2]/option[95])"))));
		year.click();
		WebElement month = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//html/body/div[3]/div/div/select[1]/option[3])"))));
		month.click();
		WebElement date = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//html/body/div[3]/table/tbody/tr[2]/td[5]/a)"))));
		date.click();
		driver.findElement(By.id("personal_cmbNation")).click();
		driver.findElement(By.xpath("(//html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[3]/li[3]/select/option[27])")).click();
		driver.findElement(By.xpath("(//input[@value='Save'])")).click();
		driver.close();
	}

}
