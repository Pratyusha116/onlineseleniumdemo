package com.testyatra.parrarelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompatabilityTesting {

	static {
		System.setProperty("webdriver.chrome.driver", "G:\\framework2\\onlineseleniumdemo\\softwares\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "G:\\framework2\\onlineseleniumdemo\\softwares\\geckodriver.exe");
	}
	
	
	@Test
	@Parameters({"browser"})
	public void loginscript(String browser) throws InterruptedException
	{
	WebDriver driver;
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(5000);
		driver.close();

	}

}
