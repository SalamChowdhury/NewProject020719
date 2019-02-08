package com.bit.shared;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	static WebDriver dr;
	
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Macbook/Downloads");
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.com/");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		
		Thread.sleep(3000);
		dr.quit();
	}
	

}
