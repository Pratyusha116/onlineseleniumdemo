package com.testyantra.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AccountTest {
	static {
		System.setProperty("webdriver.chrome.driver", "G:\\framework2\\onlineseleniumdemo\\softwares\\chromedriver.exe");
	}
	
	@Test
	public void tc_01() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ubuy.co.in/");
		driver.findElement(By.xpath("//i[@class=\"fas fa-times popup-v2 ub-newsletter-dismiss\"]")).click();
		Actions ac = new Actions(driver);
	WebElement account = driver.findElement(By.xpath("//*[@id=\"customer_short_section\"]/div/a/abbr"));
	ac.moveToElement(account).perform();
	driver.findElement(By.xpath("//a[contains(.,'Sign in')]")).click();
	driver.findElement(By.xpath("//input[@title='Email Address']")).sendKeys("prathipratyu5@gmail.com");
	driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("1234567989prathi",Keys.ENTER);
	Thread.sleep(5000);
	driver.close();
		}		
	}
