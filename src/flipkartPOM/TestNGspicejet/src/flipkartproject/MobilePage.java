package flipkartPOM.TestNGspicejet.src.flipkartproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePage {
	WebDriver driver=null;
MobilePage(WebDriver driver)
{
	this.driver=driver;
}
String getTitle()
{
	return driver.getTitle();
}
public CartPage addtocart()
{
	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	
	return new CartPage(driver);
}
}
