package com.testyantra.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeDemo2ForgotPasswordTitle {
	
	static {
		System.setProperty("webdriver.chrome.driver", "G:\\framework2\\onlineseleniumdemo\\softwares\\chromedriver.exe");
	}
	
	@Test
	public void loginscript() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
		String expected = "Forgot your password?";
		WebElement tex = driver.findElement(By.id("headerContainer"));
		String actual = tex.getText();
		Assert.assertEquals(actual, expected);
		driver.close();
	
	
	
	} 
	

}
