import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
//import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class gamestopcheck {
	WebDriver driver;
	String filepath="C:\\Users\\saita\\Desktop\\Manju Workspace\\Book2.xlsx";
	//DataFormatter dataformatter=new DataFormatter();
	//WebDriverWait wt = new WebDriverWait(driver, 10);
	//WebDriverWait wait1;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void launchurl()
	{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\saita\\Desktop\\Manju Workspace\\Trail\\jars\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.gamestop.com/");
	driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void clicksearch() throws InterruptedException
	
	{
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
		
	//Thread.sleep(8000);
	
		driver.findElement(By.xpath("//input[@id='searchRedesignTemplateInput']")).sendKeys("xbox controller"+"\n");
		
	WebElement p4 =(WebElement)wait.until(new Function<WebDriver,WebElement>(){
	      public WebElement apply(WebDriver driver ) {
	           return driver.findElement(By.xpath("//a[@href='/gaming-accessories/controllers/xbox-one/products/microsoft-xbox-elite-black-series-2-wireless-controller/202695.html']"));
	      }
	});
	p4.click();
	WebDriverWait wt = new WebDriverWait(driver, 30);
	//driver.findElement(By.xpath("//div[@class='card-body']//span")).click();
	//wt.until(ExpectedConditions.elementToBeClickable (By.xpath("/html/body/div[6]/div[5]/div[2]/div[1]/div/div[3]/div[2]/div[3]/div[12]/div[2]/div/div[1]/button[1]"))).click();
	try
	{
	WebElement p5 =(WebElement)wait.until(new Function<WebDriver,WebElement>(){
	  public WebElement apply(WebDriver driver ) {
	   return driver.findElement(By.cssSelector("#add-to-cart"));
	  }
	});
	
	Thread.sleep(5000);
	System.out.println(p5.getAttribute("class")+"hi");
	
	//JavascriptExecutor ex=(JavascriptExecutor)driver;
	//ex.executeScript("arguments[0].click()", p5);
	//Actions actions = new Actions(driver);
	actions.moveToElement(p5);

	//build()- used to compile all the actions into a single step 
	actions.click().build().perform();
	Thread.sleep(5000);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	//driver.findElement(By.xpath("//button[text()='VIEW CART']"));
  // p5.click();
  /*WebElement p6 =(WebElement)wait.until(new Function<WebDriver,WebElement>(){
	   public WebElement apply(WebDriver driver ) {
	    return driver.findElement(By.xpath("//button[text()='VIEW CART']"));
	    }
	});
//	p5.click();
	//driver.findElement(By.xpath("//button[@class='add-to-cart btn btn-primary add-to-cart-redesign']")).click();
	*/
	//System.out.println(p4.getAttribute("value"));
	Thread.sleep(10000);
	//Assert.assertEquals("https://www.gamestop.com/consoles-hardware/xbox-series-x%7Cs/gaming-accessories/controllers/products/microsoft-xbox-series-x-pulse-red-controller/233193.html",driver.getCurrentUrl());
	//wait1.until(ExpectedConditions.presenceOfElementLocated(By.))
	wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("ae-userStateStore"));
	Thread.sleep(5000);
	WebElement ele=driver.findElement(By.cssSelector("iframe[id*='ae_iframe']"));
	driver.switchTo().frame(ele);
	driver.findElement(By.xpath("//a[@href='https://www.gamestop.com/cart/']")).click();
//driver.findElement(By.xpath("//span[@class='shopping-cart d-none d-md-block material-icons material-icons-outlined']")).click();
	}
	//@AfterClass
	//public void closeall()
	{
	//	driver.quit();
	}
	
}
