package com.testyatra.parrarelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeDemo {
	
	static {
		System.setProperty("webdriver.chrome.driver", "G:\\framework2\\onlineseleniumdemo\\softwares\\chromedriver.exe");
	}
	
	@Test
	@Parameters({"user","password"})
	public void loginscript(String un,String ps) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		String expected = "actiTIME - Login";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(ps,Keys.ENTER);
		Thread.sleep(5000);
		String dashPageexpected = "actiTIME - Enter Time-Track";
		String dashPageactual = driver.getTitle();
		Assert.assertEquals(dashPageexpected, dashPageactual);
		driver.close();} }
