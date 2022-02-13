package TestNGspicejet.src.salesforceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesforceHomePage 
{
WebDriver driver=null;

	SalesforceHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	public TryForFree clicktryfree()
	{
		WebElement tryforfreebutton=driver.findElement(By.partialLinkText("Try"));		
		tryforfreebutton.click();
		return new TryForFree(driver);
	}
	
}
