package com.testyantra.scripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UrbaLadderHomePageVer {
	
	static {
		System.setProperty("webdriver.chrome.driver", "G:\\framework2\\onlineseleniumdemo\\softwares\\chromedriver.exe");
	}
	
	@Test
	public void verifyMenu() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("Launching Browser");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com/");
		Reporter.log("Loading AUT");
		String expected = "Furniture Online: Buy Home Wooden Furniture Online In India At Best Price - Urban Ladder - Urban Ladder";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		Reporter.log("Verify the homepage");
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
	 
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li/span"));
		List<String> menuItemsExpec =  Arrays.asList("Sale","Living","Bedroom","Dining","Storage","Study","Mattresses","Decor","New","Collections");
		List<String> menuItemsActu = new ArrayList<String>();
		for (WebElement menuitem : menu) {
			menuItemsActu.add(menuitem.getText());
			}
		Assert.assertEquals(menuItemsActu, menuItemsExpec);
		Reporter.log("Verify the menu");
		driver.close();
		} }
