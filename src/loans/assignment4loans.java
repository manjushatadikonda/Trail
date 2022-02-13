package loans;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assignment4loans 
{
	WebDriver driver;
	WebDriverWait wait;
	public String returnvalue(int i,int j)
	{
     WebElement value=driver.findElement(By.xpath("//div[@class='apply_pl_table_wrapper_new']//table//table//tr["+(i)+"]//td["+(j)+"]"));
	 return (value.getText());
	}
		@BeforeTest
		public void setup(){
			System.setProperty("webdriver.chrome.driver","/Users/sandeepvecha/Desktop/Java Manju/ManjuSelinium/jars/chromedriverjar");
	        driver=new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().maximize();
	        wait=new WebDriverWait(driver,20);
	        driver.navigate().to("https://www.deal4loans.com/");
	        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);// 5 sec wait gives each line a barrier of 5 sec
		
		}
		@Test(priority=0)
		public void clickonpersonalloan()
		{
			driver.findElement(By.linkText("Personal Loan")).click();
			driver.findElement(By.xpath("//div[@class='roundboximage']")).click();
			WebElement tabdetails=driver.findElement(By.xpath("//div[@class='apply_pl_table_wrapper_new']//table//table//tr[2]//td"));
			Assert.assertEquals("Yes Bank", tabdetails.getText());
			WebElement tabdetails1=driver.findElement(By.xpath("//div[@class='apply_pl_table_wrapper_new']//table//table//tr[12]//td"));
			Assert.assertEquals("HDB Financial Services", tabdetails1.getText());
		}
		@Test(priority=1)
		public void rowcount()
		{
			List<WebElement> rowcount=driver.findElements(By.xpath("//div[@class='apply_pl_table_wrapper_new']//table//table//tr"));
			Assert.assertEquals(12, rowcount.size());
		}
		@Test(priority=2)
		public void columncount()
		{
			List<WebElement> columncount=driver.findElements(By.xpath("//div[@class='apply_pl_table_wrapper_new']//table//table//tr[1]//td"));
			Assert.assertEquals(7, columncount.size());
		}
		@Test(priority=3)
		public void alertcheck()
		{
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@class='section_input_new12']"),0));
			WebElement noamount=driver.findElement(By.xpath("//div[@class='section_input_new12']//input"));
			System.out.println(noamount.getText());
			String amount=noamount.getAttribute("value");
			Assert.assertEquals("Enter Loan Amount",amount);
			//driver.findElement(By.xpath("//div[@class='section_input_new12']//input"));
			Boolean condition1;
			driver.findElement(By.xpath("//div[@class='ineed_wrapper_input1211']/child::div[2]")).click();
			
			if(wait.until(ExpectedConditions.alertIsPresent())==null)
			{
				condition1=false;
			}
			else
				condition1=true;
			Assert.assertTrue(condition1);
			String message=driver.switchTo().alert().getText();
			Assert.assertEquals("Please enter only numbers in Loan Amount .", message);
			driver.switchTo().alert().accept();
		}
		@Test(priority=4)
		public void fieldscheck()
		{
			driver.findElement(By.xpath("//div[@class='section_input_new12']//input")).sendKeys("5000");
			driver.findElement(By.xpath("//div[@class='ineed_wrapper_input1211']/child::div[2]")).click();
			//driver.findElement(By.xpath("//div[text()='I am a')]"));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='I am a ']")));
			Boolean condition;
			if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='I am a ']")))==null||wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='My Annual Income is']")))==null||wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='I am residing in ']")))==null)
			{
				condition=false;
			}
			else
				condition=true;
			Assert.assertTrue(condition);
			
		}
		@Test(priority=5)
		public void dropdowncheck() throws InterruptedException
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@name='Employment_Status']")));
			Thread.sleep(3000);
			Select s=new Select(driver.findElement(By.id("Employment_Status")));
			Boolean condition;
			
		    List<WebElement> l=s.getOptions();
		   
			if(l.get(0).getText().equalsIgnoreCase("Please Select")&&l.get(1).getText().equalsIgnoreCase("Salaried")&&l.get(2).getText().equalsIgnoreCase("Self Employed"))
			{
				condition=true;
			}
			else
				condition=false;
			Assert.assertTrue(condition);
		}
		@Test(priority=6)
		public void focuscheck()
		{  
			driver.findElement(By.xpath("//input[@name='Loan_Amount']")).clear();
			String value=driver.findElement(By.xpath("//input[@name='Loan_Amount']")).getAttribute("value");
		    System.out.println(value);
			String color=driver.findElement(By.xpath("//input[@name='Loan_Amount']")).getCssValue("border");
			System.out.println(color);
			String condition1=driver.findElement(By.xpath("//input[@name='Loan_Amount']" )).getAttribute("autofocus");
			System.out.println(condition1);
			WebElement l=driver.findElement(By.xpath("//input[@name='Loan_Amount']"));
			if(l.equals(driver.switchTo().activeElement()))
			{
				System.out.println("element is active before");
			}
			else
				System.out.println("element not active");
			driver.findElement(By.xpath("//input[@name='Loan_Amount']")).click();
			wait.until(ExpectedConditions.attributeToBeNotEmpty(l, "border"));
			if(l.equals(driver.switchTo().activeElement()))
			{
				System.out.println("element is active before");
			}
			else
				System.out.println("element not active");
			 String value1=driver.findElement(By.xpath("//input[@name='Loan_Amount']")).getAttribute("value");
			 System.out.println(value1);
			String color1=driver.findElement(By.xpath("//input[@name='Loan_Amount']")).getCssValue("border");
			System.out.println(color1);
			String condition=driver.findElement(By.xpath("//input[@name='Loan_Amount']" )).getAttribute("autofocus");
		System.out.println(condition);
		}
		@Test(priority=7)
		public void returncounttest()
		{
	     int i=2;
	     int j=3;
	     Assert.assertEquals("Upto 2%",returnvalue(i,j));
		}
	
		
}
