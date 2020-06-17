package com.testyantra.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActiTimeVerifyWrongUsnPs {
	
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
		String expected = "actiTIME - Login";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		driver.findElement(By.id("username")).sendKeys("radom");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("radom@123",Keys.ENTER);
		Thread.sleep(5000);
		WebElement forgot = driver.findElement(By.xpath("//*[@id=\"ErrorsTable\"]/tbody/tr/td[2]/table/tbody/tr/td/span"));
		String dashPageexpected = "Username or Password is invalid. Please try again.";
		String dashPageactual = forgot.getText();
		Assert.assertEquals(dashPageexpected, dashPageactual);
		driver.close();
	
	
	
	} 
	

}
