package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class redirectionpage {
	WebDriver driver=null;

	redirectionpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	public clickherepage clickhere ()
	{
		WebElement clickherelink=driver.findElement(By.linkText("here"));		
		clickherelink.click();
		return new clickherepage(driver);
	}
}
