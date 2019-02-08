package com.bit.shared;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Common {
	public void amazonNav(){
	
	{Utilis u = new Utilis();
	
		WebElement el;
		el=u.Click(By.xpath(Data.search));
		el.sendKeys("");
		
		
		do
		{
		u.scrolldown();
		u.Click(By.xpath(Data.nextpage)).click();
		}
		while(u.Click(By.xpath(Data.nextpage)).isDisplayed());
	

}
}
}