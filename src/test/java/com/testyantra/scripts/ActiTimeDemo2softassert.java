package com.testyantra.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeDemo2softassert {
	
	static {
		System.setProperty("webdriver.chrome.driver", "G:\\framework2\\onlineseleniumdemo\\softwares\\chromedriver.exe");
	}
	
	@Test
	public void loginscript() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		SoftAssert s = new SoftAssert();
		driver.navigate().to("https://demo.actitime.com/login.do");
		String expected = "actiTIME - Login";
		String actual = driver.getTitle();
		s.assertEquals(actual, expected);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(5000);
		String dashPageexpected = "actiTIME - Enter Time-Track";
		String dashPageactual = driver.getTitle();
		s.assertEquals(dashPageexpected, dashPageactual);
		s.assertAll();
		driver.close();
	
	
	
	} 
	

}
