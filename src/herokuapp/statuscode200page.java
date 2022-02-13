package herokuapp;

import org.openqa.selenium.WebDriver;

public class statuscode200page extends clickherepage
{
statuscode200page(WebDriver driver)
{
	super(driver);
}
	String geturlstring()
	{
		return driver.getCurrentUrl();
	}
}
