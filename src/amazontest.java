import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazontest {
WebDriver driver;
WebDriverWait wait;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver","/Users/sandeepvecha/Desktop/Java Manju/ManjuSelinium/jars/chromedriverjar");
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver,20);
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);// 5 sec wait gives each line a barrier of 5 sec
	
	}
	@Test(priority=0)
	public void openurl()
	{
		 driver.navigate().to("https://www.amazon.com/");
		 String currenttitle=driver.getTitle();
		 String actualtitle="Amazon.com. Spend less. Smile more.";
		 System.out.println(currenttitle);
		 Boolean webpagecondition=currenttitle.contains("Amazon");
		 Assert.assertTrue(webpagecondition);
		 Assert.assertEquals(currenttitle, actualtitle);
	}
	@Test(priority=1)
	public void addmobile()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile Phone"+"\n");
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"),10));
		List<WebElement> list1= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        int n= list1.size();
        System.out.println(n);
        Boolean condition1=n>20;
        Assert.assertTrue(condition1);
        for(int i=0; i<n; i++)
        {
        	try
        	{
        	String s1= list1.get(i).getText();
        	System.out.println(s1);
        	String s2="TCL 20 SE 6.82\" Unlocked Cellphone, 4GB RAM + 128GB ROM, US Version Android 11 Smartphone with 48MP Rear AI Quad-Camera, 5000mAh Big Battery, Dual Speaker, OTG Reverse Charging, Octa-Core, Nuit Black"; 
        	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='TCL 20 SE 6.82\" Unlocked Cellphone, 4GB RAM + 128GB ROM, US Version Android 11 Smartphone with 48MP Rear AI Quad-Camera, 5000mAh Big Battery, Dual Speaker, OTG Reverse Charging, Octa-Core, Nuit Black']")));
        	if(s1.contains(s2))
        	{
        		System.out.println("hi");
        		
        		driver.findElement(By.xpath("//span[text()='TCL 20 SE 6.82\" Unlocked Cellphone, 4GB RAM + 128GB ROM, US Version Android 11 Smartphone with 48MP Rear AI Quad-Camera, 5000mAh Big Battery, Dual Speaker, OTG Reverse Charging, Octa-Core, Nuit Black']")).click();
          
        		for(String handle : driver.getWindowHandles())
        		{
        		driver.switchTo().window(handle);
        		}
        		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        	driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
        	wait.until(ExpectedConditions.titleContains("Shopping Cart"));
        	String currenttitle1=driver.getTitle();
            Boolean condition2=currenttitle1.contains("Shopping Cart");
            Assert.assertTrue(condition2);
        	}
        	break;
        	}
        	catch(Exception e)
        	{
        		System.out.println(e);
        	}
        	
        }
	}
}
