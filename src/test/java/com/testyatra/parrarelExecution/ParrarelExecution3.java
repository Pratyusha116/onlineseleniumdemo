package com.testyatra.parrarelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParrarelExecution3 {
	static {
		System.setProperty("webdriver.chrome.driver", "G:\\framework2\\onlineseleniumdemo\\softwares\\chromedriver.exe");
	}
	@Test
	public void tc_01() {
		WebDriver driver = new ChromeDriver();                            
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		driver.close();
		}
	
	@Test
	public void tc_02() {
		WebDriver driver = new ChromeDriver();                            
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		driver.close();

		}
}
