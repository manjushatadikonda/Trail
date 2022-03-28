package salesforcetest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class salesforce {
    WebDriver driver=null;
	@BeforeClass
	public void setup()
	{ 
    System.setProperty("webdriver.chrome.driver","C:\\Users\\saita\\Desktop\\Manju Workspace\\Trail\\jars\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.salesforce.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	public String getTitle()
	{
		return driver.getTitle();
	}
	@Test
	public void clicktryfree() throws InterruptedException
	{
		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String clickSearchJS = 
				  "document.querySelector(\"body > div.globalnavigation-wrapper > hgf-globalnavigation\").shadowRoot.querySelector(\"header > div:nth-child(2) > div > div > div > div > div.globalnavbar-header-container > div.horizontal-navbar-header > div > div > div > div > div > a\")" +
				  ".click()";
				  js.executeScript(clickSearchJS);

				 
		
	}
}
