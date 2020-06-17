package com.testyantra.onlineshopping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class ToLogintoappinvalidcredentials {
	
	static {
		System.setProperty("webdriver.chrome.driver", "G:\\framework2\\onlineseleniumdemo\\softwares\\chromedriver.exe");
	}
	@Test
	public void login() throws InterruptedException{
		WebDriver driver = new ChromeDriver();                            
		Reporter.log("Launching Browser");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost/shopping/");
		driver.findElement(By.xpath("//i[@class=\"icon fa fa-user\"]")).click();
		driver.findElement(By.name("email")).sendKeys("anuj.lpu1@gmail.com");	
		driver.findElement(By.name("password")).sendKeys("Test@",Keys.ENTER);
		Thread.sleep(5000);
		String expected="Invalid email id or Password	";
		String actual="Invalid email id or Password	";
		//Assert.assertEquals(actual, expected);
		Reporter.log("Verify with invalid credentials");
		driver.close();
		Assert.assertEquals(actual, expected);
		}

}
