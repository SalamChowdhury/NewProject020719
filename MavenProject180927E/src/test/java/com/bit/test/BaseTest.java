package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver dr;
	@Before
	public void openBrowser()
	{
		
		String b= System.getProperty("browser");// to read data from the system
		
		if(b.equals("chrome"));
		dr=new ChromeDriver();
		System.out.println("");
	}
	 
		
	
	
	
	@After
	public void closeBrowser()
	{
		
		
		
	}

}
