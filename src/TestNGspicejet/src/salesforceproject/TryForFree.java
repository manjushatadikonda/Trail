package TestNGspicejet.src.salesforceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TryForFree
{
	public WebDriver driver=null;
	public User user=null;
	public WebDriverWait wait=null;
	
 public TryForFree(WebDriver driver)
   {
	this.driver=driver;
	
   }
  String getTitle()
  {
	  return driver.getTitle();
  }
  void clickNext()
	{
		WebElement nxt=driver.findElement(By.linkText("NEXT"));
		nxt.click();
	}
  
void clickbback()
{
	WebElement bck=driver.findElement(By.linkText("BACK"));
	bck.click();
}
  public WebElement detailsform(User one)
  {
	 // WebElement first=driver.findElement(By.xpath("//input[contains(@id,'UserFirstName')]"));
	  WebElement first=driver.findElement(By.xpath("//input[contains(@id,'UserFirstName')]"));
	  first.sendKeys(one.getFirstName());
	 WebElement last=driver.findElement(By.xpath("//input[contains(@id,'UserLastName')]"));
		last.sendKeys(one.getLastName());
		 WebElement job=driver.findElement(By.xpath("//input[contains(@id,'UserTitle')]"));
		job.sendKeys(one.getjobTitle());
		this.clickNext();
		
		Select s=new Select(driver.findElement(By.xpath("//select[contains(@id,'CompanyEmployees')]")));
		s.selectByVisibleText(one.getEmployees());
		 WebElement company=driver.findElement(By.xpath("//input[contains(@id,'CompanyName')]"));
		company.sendKeys(one.getCompany());
		Select s1=new Select(driver.findElement(By.xpath("//select[contains(@id,'CompanyCountry')]")));
		s1.selectByVisibleText(one.getCountry());
		this.clickNext();
		 WebElement phn=driver.findElement(By.xpath("//input[contains(@id,'UserPhone')]"));
        phn.sendKeys(one.getPhone());
        WebElement email=driver.findElement(By.xpath("//input[contains(@id,'UserEmail')]"));
        email.sendKeys(one.getEmail());
        WebElement chckbox=driver.findElement(By.className("checkbox-ui"));
        
        chckbox.click();
        return first;
		
  }
}
