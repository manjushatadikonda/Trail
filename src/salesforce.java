import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;




public class salesforce {
    WebDriver driver=null;
	@BeforeClass
	public void setup()
	{ 
    System.setProperty("webdriver.chrome.driver","C:\\Users\\saita\\Desktop\\Manju Workspace\\Trail\\jars\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.salesforce.com/");
	driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	public String getTitle()
	{
		return driver.getTitle();
	}
	public tryfree clicktryfree()
	{
		WebElement tryforfreebutton=driver.findElement(By.partialLinkText("Try"));		
		tryforfreebutton.click();
		return new tryfree(driver);
	}
}
