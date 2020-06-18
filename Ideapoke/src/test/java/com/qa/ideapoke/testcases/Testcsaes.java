package com.qa.ideapoke.testcases;




import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ideapoke.qa.base.TestBase;
import com.ideapoke.qa.util.ExtentReporterNG;
import com.ideapoke.qa.util.testutil;

//test

public class Testcsaes extends ExtentReporterNG {

	@Test
	public void drop()

	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://ipstage.in/signin.html");
		driver.findElement(By.xpath("//input[@id='loginemailid']")).sendKeys("Hemalakshmi.k@ideapoke.com");

		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("hema@123");
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Internal')]")).click();
		driver.findElement(By.xpath("//div[@id='dispsection2']//div[@class='col-lg-12 icon-background']//img[@class='img-responsive']")).click();
		driver.quit();
		
	
	}

}
