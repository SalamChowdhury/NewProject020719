package com.bit.shared;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Utilis extends Base {
	
	public WebElement Click(By by)
	
	{
		return dr.findElement(by);
		
	}
	
	public void scrolldown()
	
	{JavascriptExecutor js = (JavascriptExecutor) dr;  
	js.executeScript("scroll(0,3100");	
	}

}
