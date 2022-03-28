package salesforcetest;
import org.openqa.selenium.WebDriver;

public class tryfree {
	WebDriver driver=null;
tryfree(WebDriver driver)
{
	this.driver=driver;
}
public String getTitle()
{
	return driver.getTitle();
}
}
