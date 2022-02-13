package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class clickherepage extends redirectionpage{
	
	
	
	public clickherepage(WebDriver driver)
	   {
		super(driver);
		
	   }
	
	public String geturl()
	{
		return driver.getCurrentUrl();
	}
	
	public statuscode200page clickstatuscode ()
	{
		WebElement statuslink=driver.findElement(By.linkText("200"));		
		statuslink.click();
		return new statuscode200page(driver);
	}
}
