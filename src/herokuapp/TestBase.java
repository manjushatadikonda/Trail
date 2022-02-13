package herokuapp;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase 
{

	
	public static WebDriver driver=null;
	public String path = "webdriver.chrome.driver";
	public String value = "/Users/sandeepvecha/Desktop/Java Manju/ManjuSelinium/jars/chromedriverjar";
	public static WebDriverWait wait=null;

	public WebDriver initializedriver()
	{
		System.setProperty(path, value);
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/redirector");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		return driver;

	}

	@AfterSuite
	public void clean()
	{
		TestBase.driver.quit();
	}
	}


