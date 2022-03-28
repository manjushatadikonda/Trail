import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class datatable {
	WebDriver driver=null;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void launchurl()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\saita\\Desktop\\Manju Workspace\\Trail\\jars\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://tableassignment.s3-website.us-east-2.amazonaws.com/");
			driver.manage().window().maximize();
		    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	@Test
	public void test1(){
		List<WebElement> list=driver.findElements(By.xpath("/html/body/table/tbody/tr/td[4]"));
		for(int i=0;i<list.size();i++)
		{
			Assert.assertEquals("30", list.get(i).getText());
		}
		List<WebElement> list1=driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		Assert.assertEquals(list1.size(),7);
		}
	
	@AfterClass
	public void closing()
	{
		driver.quit();
	}
}
